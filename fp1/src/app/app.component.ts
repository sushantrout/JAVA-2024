import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { EmployeeModule } from './employee/employee.module';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'fp1';
  //document.getElementById("test").value = "SUSHANT";
  test = "Sushant";
  constructor() {

  }

  ngOnInit(): void {
  }

  showMessage() {

  }
}
