import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-app2';
  click(){
    this.title="Bonjour angular !";
  }
  ajoutElement(){
    "Hello Angular";
  }
  btnText="ajouter un element";
}
