import { Injectable } from '@angular/core';
import { Employee } from '../modules/employee';
import { employees } from '../modules/employee-list';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  employeeList:Employee[];
  constructor() { 
    this.employeeList = employees;
  }

  addEmployee(emp:Employee)
  {
    console.log(emp);
    this.employeeList.unshift(emp);
    console.log(this.employeeList)
    
  }

  getEmployees():Employee[]
  {
    return this.employeeList;
  }

}
