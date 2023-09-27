import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {HttpClientModule} from '@angular/common/http';
import { ProductModuleRoutingModule } from './product-module-routing.module';
import { CreateProductComponent } from './create-product/create-product.component';
import { ViewProductComponent } from './view-product/view-product.component';
import { SearchProductComponent } from './search-product/search-product.component';
import { EditComponent } from './edit/edit.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductComponent } from './product/product.component';

@NgModule({
  declarations: [
    CreateProductComponent,
    ViewProductComponent,
    SearchProductComponent,
    EditComponent,ProductComponent
  ],
  imports: [
    CommonModule,
    ProductModuleRoutingModule,HttpClientModule,FormsModule,ReactiveFormsModule
  ]
})
export class ProductModuleModule { }
