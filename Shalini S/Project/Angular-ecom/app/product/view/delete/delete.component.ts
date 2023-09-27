import { Component } from '@angular/core';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent {
  constructor(){
  Swal.fire({
    icon:'success',title:'PRODUCT DELETED'
  })
}}
