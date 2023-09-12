import { Pipe, PipeTransform } from '@angular/core';
import { Employee } from '../modules/employee';

@Pipe({
  name: 'dept',
 pure:true
})
export class DeptPipe implements PipeTransform {

  transform(employees: Employee[], dept: any)  {
    if(dept=='all')
    return employees;
    else
    return employees.filter((employee)=>employee.dept==dept)
  }

}
