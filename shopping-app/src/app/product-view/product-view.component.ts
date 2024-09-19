import { Component, EventEmitter, Input, OnChanges, Output, SimpleChanges } from '@angular/core';
import { Product } from '../product';
import { CommonModule, DatePipe } from '@angular/common';
import { FormControl, FormsModule } from '@angular/forms';

@Component({
  selector: 'app-product-view',
  standalone: true,
  imports: [DatePipe, CommonModule, FormsModule],
  templateUrl: './product-view.component.html',
  styleUrl: './product-view.component.css'
})
export class ProductViewComponent implements OnChanges {
  @Input() product!: Product;
  @Output() back = new EventEmitter<any>();

  ngOnChanges(changes: SimpleChanges): void {
  }

  goBack() {
    this.back.emit();
  }
}
