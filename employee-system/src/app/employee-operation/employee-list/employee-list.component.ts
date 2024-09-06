import { CommonModule, NgFor } from '@angular/common';
import { Component, EventEmitter, Input, OnChanges, Output, SimpleChanges } from '@angular/core';
import { MrPipe } from '../../mr.pipe';

@Component({
  selector: 'app-employee-list',
  standalone: true,
  imports: [NgFor, CommonModule, MrPipe],
  templateUrl: './employee-list.component.html',
  styleUrl: './employee-list.component.css',
})
export class EmployeeListComponent implements OnChanges {
  @Input() employee: any = {};

  @Output() editEmployeeData = new EventEmitter();

  employees = [
    {
      id: 1,
      name: 'John Doe',
      email: 'john.doe@example.com',
      phone: '1234567890',
      department: 'IT',
      salary: 50000,
      gender: 'male'
    },
    {
      id: 2,
      name: 'Jane Doe',
      email: 'jane.doe@example.com',
      phone: '1234567890',
      department: 'HR',
      salary: 60000,
      gender: 'female'
    },
    {
      id: 3,
      name: 'John Smith',
      email: 'john.smith@example.com',
      phone: '1234567890',
      department: 'IT',
      salary: 55000,
      gender: 'male'
    },
  ];

  ngOnChanges(changes: SimpleChanges): void {
    if(this.employee.name) {
      this.employees.push(this.employee);
    }
  }

  editEmployee(employee: any) {
    this.editEmployeeData.emit(employee);
  }

  deleteEmployee(index: any) {
    this.employees.splice(index, 1);
  }
}
