import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';

import {DemoComponent} from './demo-component/demo-component';
import { FormsModule } from '@angular/forms';
import { LifecycleHooksComponent } from './lifecycle-hooks/lifecycle-hooks.component';

@NgModule({
  declarations: [
    AppComponent,DemoComponent, LifecycleHooksComponent
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
