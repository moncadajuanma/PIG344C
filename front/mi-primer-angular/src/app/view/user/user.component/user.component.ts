import { ChangeDetectorRef, Component } from '@angular/core';
//Importar
import { UserService } from '../../../services/user.service/user.service';
import { JsonPipe } from '@angular/common';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-user.component',
  imports: [JsonPipe, CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css',
})
export class UserComponent {

  users: any[] = [];
  
  constructor(private userServi: UserService, private cdt: ChangeDetectorRef) {
    this.userServi.getUsers().subscribe((data) => {
      this.users = data;
      this.cdt.detectChanges();
      console.log(this.users);
    });
  }
}