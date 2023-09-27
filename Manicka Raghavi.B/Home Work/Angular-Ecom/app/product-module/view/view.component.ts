import { Component } from '@angular/core';
import { Product } from '../product_module/product_creation';
import { ProductService } from 'src/app/service/product.service';
import { productCategory } from '../product_module/product_array';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent 
{

  
  p1:any;

  categories=productCategory;

  category='All';

  constructor( private eService:ProductService)
  {
    this.eService.getProducts().subscribe((product)=>{this.p1=product});  

  } 
  
  
  onDelete(id:string)
  {
    console.log('the id to be deleted before the deleteProduct() is '+id); 
    const flag=this.eService.deleteProduct(id).subscribe();
    if(flag)
    {
      Swal.fire({

        title: 'Success',
  
        text: 'Product ID- '+id+' Data Deleted Succesfully!',
  
        icon: 'success',
  
        confirmButtonText: 'OK'
  
    });

    }
    
    this.eService.getProducts().subscribe((product)=>{this.p1=product});  


  }

}
