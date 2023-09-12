import { Component,Input,DoCheck, OnInit, OnChanges } from '@angular/core';

@Component({
  selector: 'app-lifecycle-hooks',
  templateUrl: './lifecycle-hooks.component.html',
  styleUrls: ['./lifecycle-hooks.component.css']
})
export class LifecycleHooksComponent implements OnInit,OnChanges,DoCheck {

  @Input() parentName:any
  @Input() empName:any

  constructor()
  {
    console.log('This is a message from the LifecycleHooksComponent Constructor '+this.parentName)
    console.log('This is a message from the LifecycleHooksComponent Constructor '+this.empName)
  }

  ngOnInit(): void {
    console.log('This is a message from the LifecycleHooksComponent OnInit '+this.parentName)
    console.log('This is a message from the LifecycleHooksComponent OnInit '+this.empName)
  }
  ngOnChanges(): void {
    // console.log('This is a message from the LifecycleHooksComponent ngOnChanges '+this.parentName)
    console.log('This is a message from the LifecycleHooksComponent ngOnChanges '+this.empName)
  }

  ngDoCheck(): void {
    // console.log('This is a message from the LifecycleHooksComponent ngDoCheck '+this.parentName)
    console.log('This is a message from the LifecycleHooksComponent ngDoCheck '+this.empName)
  }


}
