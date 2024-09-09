import { CommonModule, NgFor } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { ProductViewComponent } from './product-view/product-view.component';
import { FormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [NgFor, CommonModule, ProductDetailComponent, ProductViewComponent, FormsModule, HttpClientModule],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css',
})
export class ProductListComponent implements OnInit {
  REMOTE_URL = 'https://dummyjson.com/products/search';
  products : any= [];
  productsBK : any= [];
  selectedProduct : any;
  searchText : string = '';

  constructor(private http: HttpClient) {
    /**
     * HttpClient is a service that is used to make HTTP requests.
     */
    this.http.get(this.REMOTE_URL).subscribe((data: any) => {
      console.log(data);
    });
  }

  ngOnInit(): void {
    //Promise based API : fetch()
    //Describe few words for promise:
    //1. Promise is an object that represents the eventual completion (or failure) of an asynchronous operation and its resulting value.
    //2. Promise is a returned object to which you attach callbacks, instead of passing callbacks into a function.
    //3. Promise is used to handle the asynchronous data.
    fetch(this.REMOTE_URL).then((response) => {
      response.json().then((data) => {
        this.products = data.products;
        this.productsBK = data.products;
      });
    });
  }

  viewDetail(event : any) {
    this.selectedProduct = event; // Set the selected product to the product that was clicked
  }

  closeDetail() {
    this.selectedProduct = null; // Reset the selected product to null
  }

  search() {
    let searhcURL = this.REMOTE_URL + "?q=" + this.searchText;
    console.log(searhcURL);

    fetch(searhcURL).then((response) => {
      response.json().then((data) => {
        this.products = data.products;
        this.productsBK = data.products;
      });
    });


  }

  reset() {
    this.searchText = '';

    fetch(this.REMOTE_URL).then((response) => {
      response.json().then((data) => {
        this.products = data.products;
        this.productsBK = data.products;
      });
    });
  }

  staticSearch() {
    this.products = this.productsBK.filter((product: any) => product.title.toLowerCase().includes(this.searchText.toLowerCase())); //Javascript
  }
}
