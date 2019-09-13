import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent {

person:string= 'John Doe';

  age:number= 30;

  address:any= {street:'rue du Paradis', city:'75010 Paris'};

}
