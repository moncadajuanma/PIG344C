import { ChangeDetectorRef, Component } from '@angular/core';
//Importar
import { UserService } from '../../../services/user.service/user.service';


@Component({
  selector: 'app-user.component',
  imports: [],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css',
})
export class UserComponent {

  users: any[] = [];
  
  constructor(private userServi: UserService, private cdt: ChangeDetectorRef) {
    this.userServi.getUsers().subscribe((data: any) => {
      this.users = data.results;
      this.cdt.detectChanges();
      console.log(this.users);
    });
  }
}