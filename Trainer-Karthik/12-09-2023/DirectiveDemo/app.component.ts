import { Component } from '@angular/core';
import { Employee } from './modules/employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Directive Demo';
  emp:Employee;

  constructor()
  {
    this.emp= new Employee(101,'A',5000,'IT');
  }
}
