import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
 movies = [];
  constructor( private http: HttpClient) { }

  ngOnInit() {
  }
  searchMovies(movie){
    console.log(movie.value);
    this.http.get<any>(`http://www.omdbapi.com/?s=${movie.value}&apikey=50d8fb22`).subscribe(data => {
      this.movies = data.Search;
      console.log(this.movies);
  },err => {
    console.log(err);
    });
  }

}
