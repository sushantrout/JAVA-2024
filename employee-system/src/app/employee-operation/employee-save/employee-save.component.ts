import { Component, EventEmitter, Input, OnChanges, Output, SimpleChanges } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-employee-save',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './employee-save.component.html',
  styleUrl: './employee-save.component.css'
})
export class EmployeeSaveComponent implements OnChanges{

  employee : any = {};
  @Output() saveEmployee = new EventEmitter();
  @Input() editEmployeeData : any = {};

  saveEmployeeData() {
    this.saveEmployee.emit({...this.employee});//spread operator
    this.employee = {};
  }

  ngOnChanges(changes: SimpleChanges): void {
    this.employee = {...this.editEmployeeData};
  }
}
