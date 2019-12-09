import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  customers = [];
  constructor() { }
  printForm(loginForm: NgForm) {
    console.log(loginForm);
    // console.log(email);
    // this.customers.push(loginForm.value);
    // console.log(this.customers);
    loginForm.reset();
  }

  ngOnInit() {
  }

}
