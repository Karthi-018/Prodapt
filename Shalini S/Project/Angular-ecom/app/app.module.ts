import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ProductComponent } from './product/product.component';
import { ProductModuleModule } from './product/product-module.module';
import { ProductModuleRoutingModule } from './product/product-module-routing.module';
import { CustomerComponent } from './customer/customer.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    ProductComponent,CustomerComponent, HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,ProductModuleModule,
    ProductModuleRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
