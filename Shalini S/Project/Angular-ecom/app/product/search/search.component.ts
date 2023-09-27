import { Component } from '@angular/core';
import { product } from 'src/app/pojo/product';
import { ProductService } from 'src/app/service/product.service';
@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {
  searchItem:string='';
  searchResult:any;
  showResults:boolean=false;
  constructor(private eService:ProductService){}
  onSearch(){
    this.eService.searchProduct(this.searchItem).subscribe((e)=>this.searchResult=e);
    console.log(this.searchItem)
    this.showResults=true;
  }
}
