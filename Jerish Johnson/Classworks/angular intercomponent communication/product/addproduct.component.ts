import { Component, EventEmitter, Input, Output } from "@angular/core";

@Component({
    selector:'addproduct',
    templateUrl:'./addproduct.component.html',
    styleUrls:['./addproduct.component.css']
})

export class addproduct{
    title='this is demo Component title'

    @Output() changename=new EventEmitter<string>();

    @Input() uname:any;

    myusername:string='abc'

    public setname(name:string){
        this.uname=name;
        this.changename.emit(this.uname);
        
    }
}