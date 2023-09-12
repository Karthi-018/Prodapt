import { Component,Input } from '@angular/core';
import { Employee } from '../modules/employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {

 @Input() employee:Employee;

  constructor()
  {
    this.employee = new Employee(102,'B',6000,'HR');
  }

}
