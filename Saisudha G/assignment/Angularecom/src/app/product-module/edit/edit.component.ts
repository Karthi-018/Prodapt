import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductServiceService } from 'src/app/product-service.service';
import { FormBuilder,FormControl,FormGroup,Validators } from '@angular/forms';
import { products } from 'src/app/pojo_modules/products';
@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  
  productdetail:any
  editform : FormGroup;
  price : FormControl;
  qty : FormControl 
  id:any
  product_id:string='';

  constructor(private route:ActivatedRoute, private service: ProductServiceService , private router: Router)
  {
    this.price = new FormControl("",[Validators.required,Validators.pattern('^[1-9][0-9]*$')]);
    this.qty = new FormControl("",[Validators.required,Validators.pattern('^[1-9][0-9]*$')]);
    this.editform=new FormGroup({
    price : this.price,
    qty : this.qty
    });

  }

  ngOnInit():void
  {
    this.route.params.subscribe(params =>
      { 
        this.product_id = params['pid'];
        this.service.getProductById(this.product_id).subscribe((e)=>{
        this.productdetail=e;
          
          console.log(this.productdetail)
        });

        
      });
      
      
  }
  

  saveProductChanges()
  {
    const updateprod = {pid:this.product_id,pname:this.productdetail.pname,desp:this.productdetail.desp,category:this.productdetail.category, ...this.editform.value};
    console.log(updateprod)
    console.log('Checking !!!!!!!!')
    console.log(this.product_id)
    this.service.updateproduct(updateprod,this.product_id).subscribe();

    
  }

  }
  
    
