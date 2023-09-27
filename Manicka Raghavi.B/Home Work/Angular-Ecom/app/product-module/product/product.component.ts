import { Component, ViewEncapsulation } from '@angular/core';
import { Product } from '../product_module/product_creation'; 

import { Router } from '@angular/router';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent 
{

  constructor(private router:Router)
  {

  } 

  navigateToSearch()
  {
    this.router.navigate(['/search']);
  }

}
