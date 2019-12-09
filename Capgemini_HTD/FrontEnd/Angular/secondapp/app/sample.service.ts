import { Injectable} from '@angular/core';


@Injectable({
    providedIn: 'root',
  })
  
    export class SampleService {
        laptop = "hp";
        printService()
        {
            console.log('function is running from sample service');
        }
    }