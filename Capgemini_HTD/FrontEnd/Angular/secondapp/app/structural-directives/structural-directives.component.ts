import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {

flag=false;
person='Pournima'

  student : Student[]= [
    {
      id : 101,
      name:'Pournima',
      age:22,
      degree:'BE'
    } ,{
      id : 102,
      name:'Abhishek',
      age:22,
      degree:'12th std'
    } , {
      id : 103,
      name:'Om',
      age:22,
      degree:'Diploma'
    } , {
      id : 104,
      name:'Gauri',
      age:22,
      degree:'BE'
    } ,{
      id : 105,
      name:'Dyaneshwari',
      age:22,
      degree:'BTech'
    }
  ]

  constructor() { 

  setTimeout(() => {
    this.flag=true;
  }, 2000);
  }

  deleteStudent(student:Student)
  {
    const index = this.student.indexOf(student);
    this.student.splice(index,1);
    }
  ngOnInit() {
  }

}
