//Encargado de mostrar componente de typescript - Renderiza app.css - app.html
import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { UserService } from './services/user.service/user.service';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected readonly title = signal('mi-primer-angular');

  users: any[] = [];

  constructor(private userSer: UserService) {
    this.userSer.getUsers().subscribe((data) => {
      this.users = data;
      console.log(this.users);
    });
  }
}
