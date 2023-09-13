import { Component } from '@angular/core';
import { department } from '../modules/employee-list';
import { Employee } from '../modules/employee';

@Component({
  selector: 'app-template-form-demo',
  templateUrl: './template-form-demo.component.html',
  styleUrls: ['./template-form-demo.component.css']
})
export class TemplateFormDemoComponent {

  departments:string[];
  emp:Employee;

  hasError:boolean = false;

  constructor()
  {
    this.departments=department;
    this.emp = new Employee('','','','');
  }

  validate(data:string)
  {
    if(data === 'default') 
      this.hasError=true
      else
      this.hasError=false
  }
  dataSubmited()
  {
    console.log(this.emp);
  }

}
