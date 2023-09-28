import { Component } from '@angular/core';
import { ProductServiceService } from 'src/app/product-service.service';

@Component({
  selector: 'app-search-product',
  templateUrl: './search-product.component.html',
  styleUrls: ['./search-product.component.css']
})
export class SearchProductComponent {
searchlist: any;
 
  find: any='';
constructor(private eservice:ProductServiceService){

}
viewopr(){
  this.searchlist=this.eservice.searchproduct(this.find).subscribe((e: any)=>{if(Array.isArray(e))
  {
    console.log(e);
    this.searchlist=e;
    console.log(this.searchlist);
  }})
}
}
