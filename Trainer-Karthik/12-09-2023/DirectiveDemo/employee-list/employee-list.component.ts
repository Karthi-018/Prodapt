import { Component } from '@angular/core';
import { Employee } from '../modules/employee';
import { employees } from '../modules/employee-list';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {

  employees:Employee[];

  depts = ['IT','HR','Admin']

  dept:string='all';
  
  constructor()
  {
    this.employees = employees;
  }

  addEmp()
  {
    employees.unshift(new Employee(106,'FFF',2000,'HR'))
  }

}
