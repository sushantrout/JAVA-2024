import { Component } from '@angular/core';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeSaveComponent } from './employee-save/employee-save.component';

@Component({
  selector: 'app-employee-operation',
  standalone: true,
  imports: [EmployeeListComponent, EmployeeSaveComponent],
  templateUrl: './employee-operation.component.html',
  styleUrl: './employee-operation.component.css'
})
export class EmployeeOperationComponent {

  neeEmployee : any = {};
  editEmployeeData : any = {};
  saveEmployee(event : any) {
    this.neeEmployee = event;
  }

  editEmployee(event : any) {
    this.editEmployeeData = event;
  }
}
