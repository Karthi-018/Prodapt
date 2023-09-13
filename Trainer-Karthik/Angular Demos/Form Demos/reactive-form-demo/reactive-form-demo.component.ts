import { Component } from '@angular/core';
import { FormControl,FormGroup, Validators } from '@angular/forms';
import { department } from '../modules/employee-list';

@Component({
  selector: 'app-reactive-form-demo',
  templateUrl: './reactive-form-demo.component.html',
  styleUrls: ['./reactive-form-demo.component.css']
})
export class ReactiveFormDemoComponent {
  
  eid : FormControl;

  empForm:FormGroup;

  depts = department;

  constructor()
  {
    this.eid=new  FormControl('',[Validators.required, Validators.minLength(3),Validators.pattern("^[E].[0-9]+")]);

    this.empForm = new FormGroup({
        eid:this.eid,
        ename:new FormControl(),
        salary:new FormControl(),
        dept : new FormControl()
    })
  }


}
