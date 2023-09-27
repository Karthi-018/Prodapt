import { Pipe, PipeTransform } from '@angular/core';
import { product } from '../pojo/product';

@Pipe({
  name: 'cat'
})
export class CatPipe implements PipeTransform {

  transform(prod:product[],cat:any){
    if(cat=='all'){
      return prod;
    }
    else{
      return prod.filter((i)=>i.category==cat)
    }
  }


}
