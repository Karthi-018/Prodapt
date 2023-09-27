import { Pipe, PipeTransform } from '@angular/core';
import { Product } from './product_module/product_creation';

@Pipe({
  name: 'category'
})
export class CategoryPipe implements PipeTransform {

  transform(product:Product[], category:any) 
  { 
    if(category=='All')
    return product
    else
    return product.filter((product)=>product.category==category)
  }



}
