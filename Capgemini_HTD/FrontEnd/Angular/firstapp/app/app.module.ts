import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/HeaderComponent';
import { HomeComponent } from './home/home.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AboutComponent } from './about/about.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { MissionComponent } from './mission/mission.component';
import { VisionComponent } from './vision/vision.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    ContactUsComponent,
    LoginComponent,
    RegisterComponent,
    AboutComponent,
    PageNotFoundComponent,
    MissionComponent,
    VisionComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path : '', component:HomeComponent},
      { path : 'about', component: AboutComponent , children:[
        { path:'vision', component: VisionComponent },
        { path:'mission' ,component:MissionComponent}
      ]},
      { path : 'contact-us',component: ContactUsComponent},
      { path: 'register',component:RegisterComponent},
      { path : 'login',component:LoginComponent},
      { path: '**',component:PageNotFoundComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
