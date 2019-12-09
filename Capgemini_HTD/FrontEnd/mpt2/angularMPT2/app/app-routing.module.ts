import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { PostsComponent } from './posts/posts.component';
import { AddPostsComponent } from './add-posts/add-posts.component';




const routes: Routes = [
  { path: 'header', component: HeaderComponent },
  { path: '', component: HomeComponent },
  { path: 'posts', component: PostsComponent },
  { path: 'addposts', component: AddPostsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
