import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit {
  gitUsers = [];
  constructor(http: HttpClient) {
    http.get<any>('https://jsonplaceholder.typicode.com/posts').subscribe(data => {
      this.gitUsers = data;
    }, err => {
      console.log(err);

    });
  }




  ngOnInit() {
  }

}
