import { Injectable } from '@angular/core';
//Importar HttpClient
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  constructor(private http: HttpClient) {}
  
  //Funcion para traer el listado de usuarios
  getUsers() {
    return this.http.get<any[]>('user.json');
  }
}