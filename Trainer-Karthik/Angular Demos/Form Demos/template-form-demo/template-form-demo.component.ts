import { Component } from '@angular/core';
import { department } from '../modules/employee-list';
import { Employee } from '../modules/employee';
import { EmployeeService } from '../service/employee.service';

@Component({
  selector: 'app-template-form-demo',
  templateUrl: './template-form-demo.component.html',
  styleUrls: ['./template-form-demo.component.css']
})
export class TemplateFormDemoComponent {

  departments:string[];
  emp:Employee;
  employeelist:Employee[];


  hasError:boolean = false;

  constructor(private eService:EmployeeService)
  {
    this.departments=department;
    this.emp = new Employee('','','','');
    this.employeelist = this.eService.getEmployees();
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
    this.eService.addEmployee(this.emp);
  }




}
