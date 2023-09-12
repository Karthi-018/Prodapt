import { Component } from '@angular/core';
import { Employee } from '../modules/employee';

@Component({
  selector: 'app-pipe-demo',
  templateUrl: './pipe-demo.component.html',
  styleUrls: ['./pipe-demo.component.css']
})
export class PipeDemoComponent {

  num = 10/3;

  today = new Date();

  employee = new Employee(101,'AAA',5000,'IT');

  myArr:string[] = ['1','2','3','4','5'];


}
