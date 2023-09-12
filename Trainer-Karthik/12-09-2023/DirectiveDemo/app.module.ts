import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { DeptDirectiveDirective } from './dept-directive.directive';
import { DeptPipe } from './pipes/dept.pipe';
import { FormsModule } from '@angular/forms';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { PowerofPipe } from './powerof.pipe';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    EmployeeListComponent,
    DeptDirectiveDirective,
    DeptPipe,
    PipeDemoComponent,
    PowerofPipe
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
