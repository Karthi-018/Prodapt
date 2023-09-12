import { Component, ViewEncapsulation } from '@angular/core';


@Component({
  selector: 'app-root',
  // template :`<h1>Hi Hello Welcome to Prodapt</h1>`, //if we not need any external file
  // styles: ['h1{color:red}']
   templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  encapsulation:ViewEncapsulation.Emulated
})
export class AppComponent {
  title = 'Jerish';
  dis:boolean=false;

  uname:any;
  public sendname(changename:string){
    this.uname=changename;
  }
   
taline='center';
randomcolor=this.getRandomColor();

msg='MyValue here'
myheading='main';

public getRandomColor(){
  let letter='0123456789ABCDEF'.split('');
  var color='#'
  for (var i=0;i<6;i++){
    color+=letter [Math.floor(Math.random()*16)]
  }
  console.log(color)
  
  this.randomcolor=color;
  return color;
}
// public setcolor(){
//   this.randomcolor=this.getRandomColor();
// }


}


