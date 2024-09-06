import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  standalone: true,
  imports: [],
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {

  @Output() messageToParent = new EventEmitter<string>();

  clickOnMyName() {
    this.messageToParent.emit("I am sushant");
  }

  clickOnMyCountry() {
    this.messageToParent.emit("I am from Nepal");
  }

  clickOnMyProfession() {
    this.messageToParent.emit("I am a software developer");
  }
}
