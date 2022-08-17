import { Directive, HostBinding, HostListener } from '@angular/core';

@Directive({
  selector: '[appStyle]'
})
export class AppStyleDirective {

  constructor() { }

  @HostBinding('style.backgroundColor')
  x='white';

  @HostListener('mouseenter')
  mouseOverListner(){
    this.x='green'
  }

  @HostListener('mouseleave')
  mouseExitListner(){
    this.x='white'
  }




}
