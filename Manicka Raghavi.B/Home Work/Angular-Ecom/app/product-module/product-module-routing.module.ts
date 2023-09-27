import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateComponent } from './create/create.component';
import { ProductComponent } from './product/product.component';
import { ViewComponent } from './view/view.component';
import { SearchComponent } from './search/search.component'; 
import { EditComponent } from './edit/edit.component';

const routes: Routes = [{path:'',component:ProductComponent},
{path:'view',component:ViewComponent},{path:'search',component:SearchComponent},
{path:'create',component:CreateComponent},{path:'edits/:id',component:EditComponent}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductModuleRoutingModule { }
