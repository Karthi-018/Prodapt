import { Injectable } from '@angular/core';
import{HttpClient}from '@angular/common/http';
import { product } from '../pojo/product';
import { arr } from '../pojo/category';
import{ Observable, of, tap} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  //private proArr:product[]=[]
   url:string='http://localhost:3000';
  //url:string='http://localhost:8786/product';
  msg:string='';
  productList:product[];
  constructor(private httpClient:HttpClient) { 
    this.productList=arr;
  }

  addProduct(pro:product)
  {
    return this.httpClient.post(this.url,pro);
  }

  viewProducts()
  {
    return this.httpClient.get(this.url);
  }
  deleteProduct(pid:number){
    return this.httpClient.delete(`${this.url}/${pid}`);

  }

  // editProduct(pro:product[]){
  //   const url1=`${this.url}/${updatedProduct.pid}`;
  //   return this.httpClient.post(url1,updatedProduct);
  // }

  editProduct(upProduct:any){
    return this.httpClient.put(this.url,upProduct);
  }

  getProductdetails(prodId:any){
    return this.productList.find(product=>product.pid===prodId);
   }

  searchProduct(name:string){
    return this.httpClient.get(`${this.url}/${name}`);
  }

  getProduct(prodId:any):Observable<product>{
    return this.httpClient.get<product>(`${this.url}/product/${prodId}`).pipe(tap((product)=>{
      console.log(product);
    }));
  }
  
  updateProducts(updatedProduct:product,id:any){
    return this.httpClient.put(`${this.url}/product/${id}`,updatedProduct)
    }
}

