import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateComponent } from './create/create.component';
import { SearchComponent } from './search/search.component';
import { ViewComponent } from './view/view.component';
import { EditComponent } from './view/edit/edit.component';
import { DeleteComponent } from './view/delete/delete.component';
const routes: Routes = [
  {
   path:"create",
   component:CreateComponent
  },
  {
    path:"search",
    component:SearchComponent
  },
  {
    path:"view",
    component:ViewComponent
  },
  {
    path:"edit/:id",
    component:EditComponent
  },
  {
    path:"delete",
    component:DeleteComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProductModuleRoutingModule { }
