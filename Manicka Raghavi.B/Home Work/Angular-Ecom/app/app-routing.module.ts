import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { HomePageComponent } from './home-page/home-page.component'; 
import { ProductComponent } from './product-module/product/product.component';


const routes: Routes = [ {path:'home',component:HomePageComponent},
{path:'product',loadChildren:()=>import('./product-module/product-module.module').then(m=>m.ProductModuleModule)},
{path:'customers',component:PageNotFoundComponent},
{path:'',component:HomePageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{enableTracing:true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
