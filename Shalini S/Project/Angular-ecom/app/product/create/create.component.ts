import { Component } from '@angular/core';
import { product } from 'src/app/pojo/product';
import { category } from 'src/app/pojo/category';
import { ProductService } from 'src/app/service/product.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent {
 categories:string[];
 pro:product;
 //message:string=''
 //proArr:product[];
hasError:boolean = false;

  constructor(private eService:ProductService)
  {
    this.categories=category;
    this.pro = new product(0,'','',0,0,'');
    //this.proArr=this.eService.getProducts();
  }

  validate(data:string)
  {
    if(data === 'default') 
      this.hasError=true
      else
      this.hasError=false
  }
  dataSubmited()
  {
    console.log(this.pro);
    this.eService.addProduct(this.pro).subscribe();
    Swal.fire({
      icon:'success',title:'PRODUCT CREATED'
    })
  }


}
