import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Observable } from 'rxjs';


/**
 * Diifrence between Promise and Observable
 * Promise - Eager execution, Observable - Lazy execution
 * Promise - Single value, Observable - Multiple values
 * Promise - Single execution, Observable - Multiple execution
 */

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent implements OnInit {
  title = 'promise-observable';

  ngOnInit(): void {
    //this.getPromise();
    this.getObservable();
  }

  getPromise() {
    console.log('Step1');

    let myPromise = new Promise((resolve, reject) => {
      resolve('Promise resolved');
      console.log('Step3');
    });

    myPromise.then((data) => {
      console.log(data);
    }).catch(e => {
      console.log(e);
    }).finally(() => {
      console.log('Step4');
    });

    console.log('Step2');
  }

  getObservable() {
    console.log('Step11');

    let myObservable = new Observable((observer) => {
      observer.next('Observable resolved');
      observer.next('Observable resolved1');
      observer.next('Observable resolved2');
      observer.next('Observable resolved3');
      observer.next('Observable resolved4');
      //observer.error('Observable resolved5');
      observer.complete();
    });



    myObservable.subscribe((data) => { //next
      console.log(data);
    }, (e) => { //error
      console.log("Error: " + e);
    }, () => { //complete
      console.log('Complate');
    });

    //use next, error, complete
    myObservable.subscribe({
      next: (data) => {
        console.log(data);
      },
      error: (e) => {
        console.log("Error: " + e);
      },
      complete: () => {
        console.log('Complate');
      }
    });
    console.log('Step22');
  }
}
