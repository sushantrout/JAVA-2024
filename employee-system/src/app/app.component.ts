import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EmployeeOperationComponent } from './employee-operation/employee-operation.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, EmployeeOperationComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'employee-system';
}
