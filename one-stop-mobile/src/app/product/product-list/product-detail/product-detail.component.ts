import { Component, EventEmitter, Input, Output } from '@angular/core';
import { HeilightDirective } from '../../../heilight.directive';
import { EllipsesPipe } from '../../../ellipses.pipe';

@Component({
  selector: 'app-product-detail',
  standalone: true,
  imports: [HeilightDirective, EllipsesPipe],
  templateUrl: './product-detail.component.html',
  styleUrl: './product-detail.component.css'
})
export class ProductDetailComponent {
  @Input() product: any;
  @Output() viewDetailOutput = new EventEmitter();

  viewDetail() {
    this.viewDetailOutput.emit(this.product);
  }
}
