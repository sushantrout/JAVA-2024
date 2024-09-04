import { Component } from '@angular/core';
import { AboutComponent } from './about/about.component';
import { BlogComponent } from './blog/blog.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { PortefolioComponent } from './portefolio/portefolio.component';
import { RouterLink, RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [AboutComponent, BlogComponent, ContactComponent, HomeComponent, PortefolioComponent, RouterOutlet, RouterLink, FormsModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'shopping-mart';
  amount = 0;

  moneyRecipt(event: any) {
    console.log(event);
  }
}
