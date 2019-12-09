import { Component, OnInit } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  
 products: Product[] =[
   {
     name : 'Smart watch',
     imageUrl:'https://cdn.pixabay.com/photo/2015/06/25/17/21/smart-watch-821557__340.jpg',
     price:67687,
     details:'very good watch'
 }, {
    name : 'MacBook Air',
 imageUrl:'https://image.shutterstock.com/image-photo/cropped-image-womens-hands-keyboarding-260nw-315823193.jpg',
 price:12687,
 details:'very good macBook'
},{
  name : 'Cats',
  imageUrl:'https://image.shutterstock.com/image-photo/closeup-beard-man-icelandic-sweater-260nw-706770268.jpg',
  price:7687,
  details:'very good cat'
},{
  name : 'Dogs',
  imageUrl:'https://image.shutterstock.com/image-photo/british-cat-golden-retriever-260nw-646123102.jpg',
  price:5687,
  details:'very good dog'
}
 ]
  constructor() { }

  ngOnInit() {
  }

}
