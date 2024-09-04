import { Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { PortefolioComponent } from './portefolio/portefolio.component';
import { BlogComponent } from './blog/blog.component';
import { NotfoundComponent } from './notfound/notfound.component';

export const routes: Routes = [
  {
    path:'about',
    component: AboutComponent
  } ,
  {
    path:'contact',
    component: ContactComponent
  },
  {
    path: 'home',
    component: HomeComponent
  } ,
  {
    path:'portfolio',
    component: PortefolioComponent
  },
  {
    path:'blog',
    component: BlogComponent
  } ,{
    path:'**', //default route
    component: NotfoundComponent
  }
];
