import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { HeaderComponent } from './header/header.component';
import { GitUsersComponent } from './git-users/git-users.component';
import { MovieComponent } from './movie/movie.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { EmployeesComponent } from './employees/employees.component';


const routes: Routes = [
  { path : 'header', component: HeaderComponent},
  { path : '' , component: HomeComponent},
  { path : 'users' , component: UsersComponent},
  { path : 'git-uses', component: GitUsersComponent},
  { path: 'movie', component: MovieComponent},
  { path: 'add-employee' , component: AddEmployeeComponent},
  { path: 'employees', component: EmployeesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
