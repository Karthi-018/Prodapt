import { Injectable } from '@angular/core';
import { products } from './pojo_modules/products';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {
  
  product:products[]=[];
  url:string="http://localhost:9191/product";
  constructor(private httpclient:HttpClient) {}

  Createproduct(pro:products) {
    return this.httpclient.post(this.url,pro);
  }
  getProducts(){
    return this.httpclient.get(this.url);
  }
  deleteProduct(pid:string){
    return this.httpclient.delete(`${this.url}/${pid}`);
  }
  getProductById(pid: string) {
    return this.httpclient.get(`${this.url}/${pid}`);
  }
  // updateProduct(pid:string,updatedProduct:any){
  //   return this.httpclient.put(`${this.url}/${pid}`,updatedProduct);
  // }
  updateproduct(update:any,id:any)
  {
    return this.httpclient.put(this.url,update);
  }

  
 

  

}
