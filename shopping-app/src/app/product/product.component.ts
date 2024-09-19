import { Component } from '@angular/core';
import { Product } from '../product';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { UnpipePipe } from '../unpipe.pipe';
import { ProductViewComponent } from '../product-view/product-view.component';

@Component({
  selector: 'app-product',
  standalone: true,
  imports: [RouterOutlet, HttpClientModule, FormsModule, CommonModule, UnpipePipe, ProductViewComponent],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})
export class ProductComponent {
  title = 'shopping-app';
  products : Product[] = [];
  productsBk : Product[] = [];

  searchText: string = "";
  paginationControl : any = [];
  selected : any = null;

  constructor(private httpClient : HttpClient ) { }

  ngOnInit(): void {
    this.httpClient.get('https://dummyjson.com/products').subscribe((data : any) => {
      console.log(data);
      this.products = data?.products;
      this.getPaginationControlData();
    });
  }

  viewDetails(item : Product) {
    this.selected = item;
  }

  search() {
    this.httpClient.get('https://dummyjson.com/products/search?q=' + this.searchText).subscribe((data : any) => {
      console.log(data);
      this.products = data?.products;
      this.getPaginationControlData();
    });
  }


  getPaginationControlData() {
    if(this.products) {
      this.productsBk = this.products;
      let total = this.products.length;
      let pageSize = 8;
      let pages = total / pageSize;
      let paginationControl = [];
      for(let i = 0; i < pages; i++) {
        paginationControl.push(i);
      }

      this.paginationControl = paginationControl;
    }
  }

  paginate(pageData : any) {
    if(this.productsBk) {
      let pageSize = 8;
      let start = pageData * pageSize;
      let end = start + pageSize;
      this.products = this.productsBk.slice(start, end);
    }
  }

  loadAll() {
    this.products = this.productsBk;
    this.selected = null;
  }
}
