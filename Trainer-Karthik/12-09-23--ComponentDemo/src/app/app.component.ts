import { Component, ViewEncapsulation,OnInit,OnChanges, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  // encapsulation : ViewEncapsulation.ShadowDom
})
export class AppComponent {

  

  // title = 'This is App Component Title';

  // Student = {sname:'test'}

  // constructor()
  // {
  //   console.log('This is a message from the AppComponent Constructor '+this.uname)
  // }

  // ngOnInit(): void {
  //   console.log('This is a message from the AppComponent OnInit '+this.uname)
  // }
  // ngOnChanges(): void {
  //   console.log('This is a message from the AppComponent ngOnChanges '+this.uname)
  // }



  // // fname='ABC';
  // // lname ='XYZ';

  // uname:any;

  // newName(newName:any)
  // {
  //   this.uname=newName
  // }



  choice = false;

  bttnName = 'Show'

  bttnClick(userChoice:boolean)
  {
    if(userChoice)
    {
      this.choice=true
      this.bttnName='Hide'
    }
    else
    {
      this.choice=false
      this.bttnName='Show'
    }
  }



  empNames=['AAA','BBB','CCCC','DDD'];


  empArr = [{eid:101,ename:'AAA',salary:8000,dept:'IT'},
            {eid:102,ename:'BBB',salary:18000,dept:'IT'},
            {eid:103,ename:'CCC',salary:5000,dept:'HR'},
            {eid:104,ename:'DDD',salary:6000,dept:'Admin'},
            {eid:105,ename:'EEE',salary:9000,dept:'IT'}];


}

