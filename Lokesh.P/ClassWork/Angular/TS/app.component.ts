import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template:`<h1>Hi Hello</h1>`,
  // templateUrl: './app.component.html',
  // styleUrls: ['./app.component.css']
  styles:[`h1{color:red}`]
})
export class AppComponent {
  title = 'welcome to Angular CLI';
  taline='center';
  randomcolor=this.getRandomColor();
  myheading='main'
  public getRandomColor()
  {
    var letter='0123456789ABCDEF'.split('');
    var color='#';
    for(var i=0;i<6;i++)
    {
      color+=letter[Math.floor(Math.random()*16)]
    }
    console.log(color);
    return color;
  }
}
