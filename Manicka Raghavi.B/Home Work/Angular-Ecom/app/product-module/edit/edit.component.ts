import { Component } from '@angular/core';
import { AbstractControl, FormControl, FormGroup, ValidatorFn, Validators } from '@angular/forms';
import { StartsWithValidation, atLeastOneFieldValidator } from './Validations';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from 'src/app/service/product.service';
import { Product } from '../product_module/product_creation';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent 
{

  product_price:FormControl;

  product_quantity:FormControl;

  productForm:FormGroup; 


  products:any

  productId:string=''; 

  price:string='';

  ngOnInit(): void {

    this.route.params.subscribe(params => {

      this.productId = params['id'];

      this.eService.reteriveProduct(this.productId).subscribe((emp)=>{this.products=emp});  
      if(this.products)
      {
        this.product_price.setValue(this.products.price) 
        this.product_quantity.setValue(this.products.quantity); 
      }
  

    });

  }

  constructor(private route: ActivatedRoute, private eService: ProductService,private router:Router) {

    this.product_price = new FormControl(null, [Validators.required, Validators.pattern('^[1-9][0-9]*$')]);

    this.product_quantity = new FormControl(null, [Validators.required, Validators.pattern('^[1-9][0-9]*$')]);

    console.log('product_price '+this.product_price)

    this.productForm = new FormGroup({

      product_price: this.product_price,

      product_quantity: this.product_quantity

    });

  }
  
  onDataSubmitted()
  {


    const flag=this.eService.editProduct(this.productId,this.productForm.get('product_price')?.value,this.productForm.get('product_quantity')?.value).subscribe(); 
    
    if(flag)
    {
      Swal.fire({

        title: 'Success',
  
        text: 'Data Edited Succesfully!',
  
        icon: 'success',
  
        confirmButtonText: 'OK'
  
    }).then((result) => {
  
        if (result.isConfirmed) {
            console.log("successfully edit")
             //this.productForm.reset();
             this.router.navigate(['/view']);
        }
  
    }); 
    } 
    else
    {
      console.log('not able to edit properly')
    }
    
   }

}
