import { Component, OnInit, OnDestroy } from '@angular/core';
import { FormGroup, Validators, FormControl, NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit, OnDestroy {

  constructor() { 
    console.log('register component custructor is running')
  }
  get email()
  {
    return this.registerForm.get('email');
  }

  get password() {
    return this.registerForm.get('password');
  }
 registerForm = new FormGroup({
   email : new FormControl('',[
   Validators.required,
   Validators.email,
   Validators.minLength(8) ]
 ),

 password : new FormControl('',[
   Validators.required,
   Validators.minLength(8)
 ])});

 printForm( Form: NgForm) {
   console.log(Form.value);

 }

  ngOnInit() {
    console.log('component initilized')
  }
  ngOnDestroy() {
    console.log('component destroy')
  }

}
