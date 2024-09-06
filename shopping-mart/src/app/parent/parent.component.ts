import { Component } from '@angular/core';
import { ChildComponent } from './child/child.component';

@Component({
  selector: 'app-parent',
  standalone: true,
  imports: [ChildComponent],
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent {
  fromChildData = "I dont know what to write here";

  replaceOldvalue(event : string) {
    this.fromChildData = event;
  }
}
