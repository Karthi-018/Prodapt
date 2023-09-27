import { Component } from '@angular/core';
import { ProductServiceService } from 'src/app/product-service.service';

@Component({
  selector: 'app-view-product',
  templateUrl: './view-product.component.html',
  styleUrls: ['./view-product.component.css']
})
export class ViewProductComponent {
  productlist:any;
  constructor(public ps:ProductServiceService){
    this.ps.getProducts().subscribe((pro)=>{this.productlist=pro});
    

    
  }
  deleteProduct(pid:string){
    this.ps.deleteProduct(pid).subscribe(); 
    this.ps.getProducts().subscribe((pro)=>{this.productlist=pro});
  }
}
