import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductComponent } from './product-module/product/product.component';
import { CreateProductComponent } from './product-module/create-product/create-product.component';
import { ViewProductComponent } from './product-module/view-product/view-product.component';
import { SearchProductComponent } from './product-module/search-product/search-product.component';
import { EditComponent } from './product-module/edit/edit.component';

const routes: Routes = [{path:'products',component:ProductComponent},{path:'create',component:CreateProductComponent},
{path:'view',component:ViewProductComponent},{path:'search',component:SearchProductComponent},{path:'edit/:pid',component:EditComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
