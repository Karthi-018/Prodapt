import { Component } from '@angular/core';
import { ProductService } from 'src/app/service/product.service';
import { Product } from '../product_module/product_creation';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent 
{
  searchItem:string=''; 
  
  products:any

  constructor(private eService:ProductService)
  {
   
  } 
 
  onSearch(productItem:string)
  {
    
     const flag=this.eService.searchProduct(productItem).subscribe((emp)=>{this.products=emp}); 
     
     if(!flag) 
     console.log('unable to process the request'); 

  } 

  onDelete(id:string):void
  {
    console.log('the id to be deleted before the deleteProduct() is '+id); 

    this.eService.deleteProduct(id).subscribe();
    this.eService.getProducts().subscribe((product)=>{this.products=product});   

  }

}
