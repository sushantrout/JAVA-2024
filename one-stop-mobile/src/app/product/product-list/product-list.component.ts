import { CommonModule, NgFor } from '@angular/common';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  standalone: true,
  imports: [NgFor, CommonModule],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css',
})
export class ProductListComponent implements OnInit {
  REMOTE_URL = 'https://dummyjson.com/products/search';
  products : any= [];

  ngOnInit(): void {
    fetch(this.REMOTE_URL).then((response) => {
      response.json().then((data) => {
        this.products = data.products;
      });
    });
  }
}
