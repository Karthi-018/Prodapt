import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TemplateFormDemoComponent } from './template-form-demo/template-form-demo.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ReactiveFormDemoComponent } from './reactive-form-demo/reactive-form-demo.component';

@NgModule({
  declarations: [
    AppComponent,
    TemplateFormDemoComponent,
    ReactiveFormDemoComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
