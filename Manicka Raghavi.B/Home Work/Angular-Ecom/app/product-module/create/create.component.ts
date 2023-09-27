import { Component } from '@angular/core';
import { Product } from '../product_module/product_creation';
import { ProductService } from 'src/app/service/product.service';
import {productCategory } from '../product_module/product_array';
import Swal from 'sweetalert2';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent 
{

  product:Product; 
  
  temp:any; 

  flag:any;

  inputPrice:string=''; 

  inputQuantity:string='';

  hasError:boolean=false;  
 
  categories:string[];
 
  products:Product[]=[]; 

  constructor(private eService:ProductService)
  {
    this.product=new Product('','','','',0,0);   

    this.categories=productCategory;
  } 

  updatePrice()
  {
    this.product.price=!isNaN(parseInt(this.inputPrice,10))?parseInt(this.inputPrice,10):0;  
  } 

  updateQuantity()
  {
    this.product.quantity=!isNaN(parseInt(this.inputQuantity,10))?parseInt(this.inputQuantity,10):0; 
  }
   
  validate(data:string)
  {
    if(data === 'default') 
      this.hasError=true
      else
      this.hasError=false
  }

  dataSubmitted(form:NgForm)
  {
    console.log('on submitting from form'+this.product.id+' '+this.product.name);  

    const productClone={...this.product} 

    //this.flag=this.eService.addProduct(productClone).subscribe();

    this.eService.reteriveProduct(this.product.id).subscribe((product)=>
    {this.temp=product
      let swal_title,swal_text;
      let swal_icon:'error'|'success'|'warning'|'info'|'question'='error';
     if(this.temp.length>1)
     {
      console.log('the length of the temp will be '+this.temp.length);
      swal_title='Not Successfull';
      swal_text='Data Already Present!'
      swal_icon='error'; 
      Swal.fire({

        title:swal_title,
  
        text:swal_text,
  
        icon:swal_icon,
  
        confirmButtonText: 'OK'
  
     });
     } 
     else
     {
      this.flag=this.eService.addProduct(productClone).subscribe(()=>
      {
        swal_title='Success';
        swal_text='Data Added Succesfully!'
        swal_icon='success'; 
        Swal.fire
        ({

          title:swal_title,
    
          text:swal_text,
    
          icon:swal_icon,
    
          confirmButtonText: 'OK'
    
        }).then(()=>{
    
          if(this.flag) 
          {
            form.resetForm();  //Reset the form after SweetAlert
           }
        });
      });  
    }
  });   
  }
    
}
