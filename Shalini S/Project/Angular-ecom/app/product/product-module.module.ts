import { NgModule} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule ,ReactiveFormsModule} from '@angular/forms';
import { CommonModule } from '@angular/common';
import { ProductModuleRoutingModule } from './product-module-routing.module';
import { CreateComponent } from './create/create.component';
import { ViewComponent } from './view/view.component';
import { SearchComponent } from './search/search.component';
import { EditComponent } from './view/edit/edit.component';
import { DeleteComponent } from './view/delete/delete.component';
import { CatPipe } from './cat.pipe';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [CreateComponent,ViewComponent,SearchComponent, EditComponent, DeleteComponent, CatPipe],
  imports: [
    CommonModule,
    ProductModuleRoutingModule,BrowserModule,FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  exports:[CreateComponent,ViewComponent,SearchComponent,EditComponent,DeleteComponent,CatPipe]
})
export class ProductModuleModule { }
