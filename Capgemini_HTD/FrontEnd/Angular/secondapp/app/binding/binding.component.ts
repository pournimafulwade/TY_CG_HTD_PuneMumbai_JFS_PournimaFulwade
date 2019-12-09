import { Component, OnInit, Input } from '@angular/core';
import { delay } from 'q';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  inputData;
  flag=false;
name='Pournima';
imgURL="https://cdn.pixabay.com/photo/2019/10/24/10/51/morning-4573991_1280.jpg"

  constructor() { 
    // setTimeout(() => {
    //   this.flag=true;
    // },5000);

    setInterval(() =>
    {
      this.flag=!this.flag;
    },100);
  }
     
    eventOccured(input){
      console.log(input.value);
      console.log('key up event occoured')
    }
    
  

  ngOnInit() {
  }

}
