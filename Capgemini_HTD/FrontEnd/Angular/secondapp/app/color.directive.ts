import { Directive, ElementRef, HostListener, HostBinding } from "@angular/core";

@Directive({
    selector:'[appColor]'
})

export class ColorDirective {
    constructor(private el: ElementRef){
        this.el.nativeElement.style.backgroundColor ='black';
        this.el.nativeElement.style.color ='white';
        this.el.nativeElement.style.padding= '1px';
        // this.el.nativeElement.style.fontSize='30px';
    }

    @HostBinding('style.fontSize') fontSize;

    @HostListener('mouseenter')
    mouseEnter(){
        console.log('mouse entered');
        this.fontSize = '10px'
        this.el.nativeElement.style.background ='blue';
    }
    @HostListener('mouseleave')
    mouseLeave(){
        console.log('mouse Leaved');
        this.fontSize='10px'
        this.el.nativeElement.style.background ='red';
    
    }
}