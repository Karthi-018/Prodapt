
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductService } from 'src/app/service/product.service';
import Swal from 'sweetalert2';
@Component({

  selector: 'app-edit',

  templateUrl: './edit.component.html',

  styleUrls: ['./edit.component.css']

})

export class EditComponent implements OnInit {
  // productdetail:any
  // editform : FormGroup;
  // pid:FormControl;
  // price : FormControl;
  // qty : FormControl
  // constructor(private route:ActivatedRoute, private service: ProductService, private router: Router)
  // {
  //   this.pid = new FormControl("",[Validators.required,Validators.pattern('^[A-Z][0-9][0-9]*$')]);
  //   this.price = new FormControl("",[Validators.required,Validators.pattern('^[1-9][0-9]*$')]);
  //   this.qty = new FormControl("",[Validators.required,Validators.pattern('^[1-9][0-9]*$')]);
  //   this.editform=new FormGroup({
  //   pid:this.pid,  
  //   price : this.price,
  //   qty : this.qty
  //   });

  // }
  // datasubmitted()
  // {
  //   console.log('Updating Product!!!')
  //   const upProduct = {
  //     ...this.productdetail,
  //     pid:this.editform.get('pid')?.value,
  //     price: this.editform.get('price')?.value,
  //     qty: this.editform.get('qty')?.value
  //   };
  //   this.service.editProduct(upProduct).subscribe();
  //   // console.log(this.pid,this.price,this.qty)
  //   Swal.fire({
  //     icon: 'success',
  //     title: ' Product Updated Successfully '
  //   });
  //   this.router.navigateByUrl('/view')
  // }

  price:FormControl;
  quantity:FormControl;
  editProductForm: FormGroup;
  productId: any;
  productdetails: any;
  hasError:boolean=false;

  constructor(private route: ActivatedRoute, private eService: ProductService) {
    this.price=new FormControl('',[Validators.required,Validators.min(1)]),
    this.quantity=new FormControl('',[Validators.required,Validators.min(1)]),
    this.editProductForm = new FormGroup({

      name: new FormControl({ value: '', disabled: true }),
      description: new FormControl({ value: '', disabled: true }),
      id: new FormControl({ value: '', disabled: true }),
      category: new FormControl({ value: '', disabled: true }),
      price:this.price,
      quantity:this.quantity,
    });
  }
  ngOnInit(): void {
    this.route.params.subscribe((params) => {
      this.productId = params['id'];
      console.log(this.productId);
      this.eService.getProduct(this.productId).subscribe((product)=>{
        console.log(product);
      if(Array.isArray(product)){
          this.productdetails=product[0];
          console.log(product[0])
          this.editProductForm.patchValue({
          id: this.productdetails.pid,
          name: this.productdetails.pname,
          description: this.productdetails.pdesc,
          category: this.productdetails.category,
          price: this.productdetails.price,
          quantity: this.productdetails.quantity,
          });

        console.log(this.productdetails.name);}
      });
      });
  }

  validate(data:string)

  {
    if(data === 'default')
      this.hasError=true
      else
      this.hasError=false
  }

updateProduct() {
if(this.editProductForm.valid){
    const updatedProduct = {id:this.productId,...this.editProductForm.value};
    console.log('Updated Product:', updatedProduct);
    this.eService.updateProducts(updatedProduct,this.productId).subscribe();
    Swal.fire({
      icon:'success',title:'PRODUCT EDITED'
    })
  }
  }
 
}
