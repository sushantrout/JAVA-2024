import { CommonModule, UpperCasePipe } from '@angular/common';
import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-about',
  standalone: true,
  imports: [UpperCasePipe],
  templateUrl: './about.component.html',
  styleUrl: './about.component.css'
})
export class AboutComponent {
  name = "prianshi";
  @Input() money: number = 0;
  @Output() moneySent = new EventEmitter<number>();

  sendMoneyToMother() {
    this.moneySent.emit(this.money * 500); //it will send the signal to parent component
  }
}
