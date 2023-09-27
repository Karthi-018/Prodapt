import { Component } from '@angular/core';
import { products } from 'src/app/pojo_modules/products';
import { ProductServiceService } from 'src/app/product-service.service';

@Component({
  selector: 'app-create-product',
  templateUrl: './create-product.component.html',
  styleUrls: ['./create-product.component.css']
})
export class CreateProductComponent {
pro:products=new products('','','','',0,0);
selectedCategory:string='';
category:string[]=['Appliances','Mobiles','Homeneeds','Watch','laptops'];
submitted=false;
constructor(private ps:ProductServiceService){}

onSubmit(){
  this.ps.Createproduct(this.pro).subscribe((response: any)=>{this.submitted=true;});
}
}
