import { Directive,ElementRef,Renderer2,OnInit,Input,HostListener,HostBinding } from '@angular/core';

@Directive({
  selector: '[appDeptDirective]'
})
export class DeptDirectiveDirective implements OnInit {

  @Input() dept:any;

  @HostBinding('class') setColor:any

  constructor(private el:ElementRef,private render:Renderer2) { 
    // this.render.setStyle(this.el.nativeElement,'background-color','green')
  }

  ngOnInit(): void {
    
    if(this.dept =='IT')
    {
      // this.render.setStyle(this.el.nativeElement,'background-color','blue');
      this.setColor='it';
    }
    else if(this.dept == 'HR')
    {
      // this.render.setStyle(this.el.nativeElement,'background-color','yellow');
      this.setColor='hr';
    }
    else if(this.dept == 'Admin')
    {
      // this.render.setStyle(this.el.nativeElement,'background-color','crimson');
      this.setColor='admin';
    }
  }

  @HostListener('mouseover')
  mouseover()
  {
    this.render.setStyle(this.el.nativeElement,'opacity','0.5')
  }

  @HostListener('mouseout')
  mouseout()
  {
    this.render.setStyle(this.el.nativeElement,'opacity','1')
  }


}
