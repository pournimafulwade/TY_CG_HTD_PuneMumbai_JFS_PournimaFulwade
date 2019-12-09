import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule, convertToParamMap } from '@angular/router';
import { BindingComponent } from './binding/binding.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { TwoWayDatabindingComponent } from './two-way-databinding/two-way-databinding.component';
import { StructuralDirectivesComponent } from './structural-directives/structural-directives.component';
import { ProductsComponent } from './products/products.component';
import { ParentComponent } from './parent/parent.component';
import { BikeComponent } from './bike/bike.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';



const routes: Routes = [
  { path :'',component:HomeComponent},
  { path:'header',component:HeaderComponent},
  { path:'data-binding',component:BindingComponent},
  { path :'two-way-databinding',component:TwoWayDatabindingComponent},
  { path :'structural-directives', component:StructuralDirectivesComponent},
  { path : 'product' , component:ProductsComponent},
  { path:'parent' , component:ParentComponent},
  { path : 'bike' , component:BikeComponent},
  { path:'login',component:LoginComponent},
  { path : 'register' , component:RegisterComponent}
 
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
