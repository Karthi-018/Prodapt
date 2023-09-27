import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProductModuleRoutingModule } from './product-module-routing.module';
import { ProductComponent } from './product/product.component';
import { CreateComponent } from './create/create.component';
import { ViewComponent } from './view/view.component';
import { SearchComponent } from './search/search.component'; 

import { FormsModule ,ReactiveFormsModule} from '@angular/forms';
import { EditComponent } from './edit/edit.component';
import { CategoryPipe } from './category.pipe';  
import {HttpClientModule} from '@angular/common/http'; 



@NgModule({
  declarations: [
    ProductComponent,
    CreateComponent,
    ViewComponent,
    SearchComponent,
    EditComponent,
    CategoryPipe
  ],
  imports: [
    CommonModule,
    ProductModuleRoutingModule,FormsModule,ReactiveFormsModule,HttpClientModule
  ]
})
export class ProductModuleModule { }
