import { Component, OnInit } from '@angular/core';
import { Bike } from '../bike';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {
 bikes : Bike[] = [
    {
      brand : 'Royal Enfield',
      imgURL :'https://cdn.pixabay.com/photo/2017/11/23/04/08/royal-enfield-2972008__340.jpg',
      model : 'classic 350',
      price : 15000,
      specs: 'The Royal Enfield Classic 350 is powered by a 346 cc air-cooled engine which produces of power. It has a fuel tank of 13.5 L and a claimed mileage of 40.8 kmpl. The Royal Enfield Classic 350 starts at Rs 1.45 Lakh and goes up to Rs 1.64 Lakh (ex-showroom, Delhi). It is available in five variants.'
    },
    {
      brand : 'TVS',
      imgURL :'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819__340.jpg',
      model : 'Yamaha FZ-S',
      price : 68000,
      specs: 'Comfort. Tvs are not a good and sestify bike this ceat os so hard and uncomfortable ceat very small this bike not to be buy some all kinds feature is very bad there shock absorber are not be comfortable and non absorber facilities back sock absorber so small and uncomfortable and rare shock absorber is not to be good'
    },
    {
      brand : 'Pulser',
      imgURL :'https://cdn.pixabay.com/photo/2016/09/23/21/08/motorcycle-1690452__340.jpg',
      model : ' Bajaj Pulsar 150',
      price : 35000,
      specs: 'The Bajaj Pulsar 150 is powered by a 149.5 cc air-cooled engine which produces of power. It has a fuel tank of 15 L and a claimed mileage of 65 kmpl. The Bajaj Pulsar 150 starts at Rs 75,200 and goes up to Rs 89,837 (ex-showroom, Delhi). It is available in three variants'
    },
    {
      brand : 'Bugatti',
      imgURL :'https://cdn.pixabay.com/photo/2013/06/05/02/00/bugatti-116491__340.jpg',
      model : 'Bugatti Veyron',
      price : 50000,
      specs: 'It is powered by a 7993cc engine which generates a maximum power of 1200 bhp @ 6400 rpm and gives out a torque of 1500 Nm @ 3000 rpm. The car has a fuel tank capacity of a humongous 100 litres and the sports car is powered by a 16 cylinder engine. Bugatti Veyron runs on a 7 speed twin-clutch automatic gearbox'
    }
  ] 
  selectedBike: Bike = this.bikes[0];
  constructor() { }

  selectBike(bike){
    this.selectedBike = bike;
  }

  ngOnInit() {
  }

}
