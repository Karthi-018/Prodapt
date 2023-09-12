import { Component, ViewEncapsulation, Input, Output, EventEmitter,OnChanges, OnInit } from "@angular/core";

@Component({
    selector : 'demo',
    templateUrl : './demo-component.html',
    styleUrls : ['./demo-component.css'],
    encapsulation : ViewEncapsulation.None
})

export class DemoComponent implements OnInit,OnChanges
{



    @Input() myName:any

    @Output() changeName = new EventEmitter<string>();

    myComponentName = 'This a Demo Component Title';
    myUserName:string='ABC';

    constructor()
  {
    console.log('This is a message from the DemoComponent Constructor'+this.myUserName)
  }

  ngOnInit(): void {
    console.log('This is a message from the DemoComponent OnInit'+this.myUserName)
  }

  ngOnChanges(): void {
    console.log('This is a message from the DemoComponent ngOnChanges '+this.myName);
  }

    sendName(inputName:any)
    {
        this.myName = inputName;
        this.changeName.emit(this.myName)
    }
    printName(inname:any)
    {
        this.myName=inname;
        this.changeName.emit(this.myName);
    }
}