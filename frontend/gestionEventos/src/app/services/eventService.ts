import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
//conexion con el bakcend
@Injectable({
  providedIn: 'root',
})
export class EventService {

  private api: string = 'http://localhost:8080/api/events';
  
  constructor(private http: HttpClient) {
  }

  //programacion reactiva    //observable: flujo de datos asincrono
  //ESPERA A QUE TODO LOS DATOS ESTEN DISPONIBLES PARA MOSTRARLOS EN EL FORNTEND
  getEventList(): Observable<Event[]> {
    return this.http.get<Event[]>(this.api);
  }
}
