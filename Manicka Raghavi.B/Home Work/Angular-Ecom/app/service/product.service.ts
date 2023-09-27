import { Injectable } from '@angular/core';
import { Product } from '../product-module/product_module/product_creation';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService 
{

  products:Product[]=[];  
  
  url:string='http://localhost:3000'; 

  //url:string='http://localhost:8182';

   constructor(private httpclient:HttpClient) 
  {
  }
   
  addProduct(prod:Product)
  {
    console.log('heeee');  

    return this.httpclient.post(this.url,prod);
    
    //return this.httpclient.post(this.url+'/addProduct',prod);


  } 

  getProducts()
  {
   
    return this.httpclient.get(this.url+'/getProducts'); 

  } 


  deleteProduct(productId:String)
  {
    return this.httpclient.delete(`${this.url}/${productId}`);  
    
    //return this.httpclient.delete(this.url+'/deleteProduct/'+productId);
  }  
   
  searchProduct(productItem:string)
  {
    return this.httpclient.get(`${this.url}/${productItem}`);
  } 

  reteriveProduct(productId:string)
  {
   return this.httpclient.get(this.url+'/productId/'+productId);  

   //return this.httpclient.get(this.url+'/getProduct/'+productId);

  } 

  editProduct(productId:string,product_price:string,product_quantity:string)
  {
    const currentPrice=parseInt(product_price,10);  
    const currentQuantity=parseInt(product_quantity,10);
    const array_list=[currentPrice,currentQuantity,productId];  
    return this.httpclient.put(`${this.url}/product/${productId}`,array_list) 
  }
   

 }
