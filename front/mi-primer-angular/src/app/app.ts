//Encargado de mostrar componente de typescript - Renderiza app.css - app.html
import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ChangeDetectorRef } from '@angular/core';
import { UserService } from './services/user.service/user.service';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css',
})
export class App {
  protected readonly title = signal('mi-primer-angular');

detectChanges() {
    /* this.cdt.detectChanges(); */
  }
}
