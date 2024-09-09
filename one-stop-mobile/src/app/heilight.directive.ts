import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHeilight]',
  standalone: true
})
export class HeilightDirective {

  constructor(private el: ElementRef, private renderer: Renderer2) { }

  // Listen for mouseenter event to change the button color
  @HostListener('mouseenter')
  onMouseEnter() {
    this.renderer.setStyle(this.el.nativeElement, 'background-color', 'red');
    this.renderer.setStyle(this.el.nativeElement, 'color', 'white');
  }

  // Listen for mouseleave event to reset the button color
  @HostListener('mouseleave')
  onMouseLeave() {
    this.renderer.removeStyle(this.el.nativeElement, 'background-color');
    this.renderer.removeStyle(this.el.nativeElement, 'color');
  }

}
