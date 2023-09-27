import { Component } from '@angular/core';
import { product } from 'src/app/pojo/product';
import { ProductService } from 'src/app/service/product.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent {
  msg:string='';
  proArr:any;
//---------------------------------------
  categories=['PHONE','LAPTOP','TV','COMPUTER'];
  cat='all';
//---------------------------------------  
  constructor(private eService:ProductService)
  {
    this.proArr=this.eService.viewProducts().subscribe((e)=>this.proArr=e);
  }


  onDelete(pid:number):void{
    this.eService.deleteProduct(pid).subscribe();
  }

}
