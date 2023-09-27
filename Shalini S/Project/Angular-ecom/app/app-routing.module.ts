import { RouterModule, Routes } from '@angular/router';
import { Component, NgModule } from '@angular/core';
import { ProductComponent } from './product/product.component';
import { CustomerComponent } from './customer/customer.component';
import { HomeComponent } from './home/home.component';
const routes: Routes = [
  {
    path:"product",
    component:ProductComponent
  },
  {
    path:"customer",
    component:CustomerComponent
  },
  {
    path:"home",
    component:HomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
