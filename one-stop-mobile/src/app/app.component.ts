import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductComponent } from "./product/product.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ProductComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent implements OnInit {
  title = 'one-stop-mobile';

  /* let emp = new Employee() //consturcutor
  emp.name =""; //init
  emp.age = 23; */

  constructor() {
    console.log('Constructer');
  }

  ngOnInit(): void {}

  fun1() {
    console.log('OnInit');
    console.log('Start');
    for (let i = 0; i < 10; i++) {
      console.log('Hello World ' + i);
    }
    console.log('End');
  }

  //asyncrnous
  //let is used to declare variable
  //new Promise is used to create promise object
  //type of myProise is Promise<String>

  //Promise is always Eager
  function2() {
    let myProise = new Promise((resolve, reject) => {
      //resolve('Hello'); //then
      console.log('Resolved');
      //reject('Reject');
      resolve('Hello1');
      console.log('Resolved1');
    });

    myProise
      .then((satya) => {
        console.log('Success ' + satya);
      })
      .catch((priyanshi) => {
        console.log('Error ' + priyanshi);
      })
      .finally(() => {
        console.log('Finally');
      });
  }

  fetchData() {
    this.fun1(); //syncrnous
    this.function2();

    //fetch function return  Promise it is defined by javascrupt
    //Fetch will return Promise so if it sucess the  then method call,
    //Then method parameter type is Response inside the respone json() is one method thise json will return anther promise
    fetch('https://dummyjson.com/products/search').then(
      (response: Response) => {
        response.json().then((data) => {
          console.log(data);
        });
      }
    );

    console.log('OnInit End');
  }
}
