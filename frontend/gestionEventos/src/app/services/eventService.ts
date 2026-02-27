import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import {EventModel} from '../eventModel';
//conexion con el bakcend
@Injectable({
  providedIn: 'root',
})
export class EventService {

  private api: string = 'http://localhost:8080/api/events/';

  constructor(private http: HttpClient) {}

  //programacion reactiva    //observable: flujo de datos asincrono
  //ESPERA A QUE TODO LOS DATOS ESTEN DISPONIBLES PARA MOSTRARLOS EN EL FORNTEND
  getEventList(): Observable<EventModel []> {
    return this.http.get<EventModel[]>(this.api);
  }

  postAddEvents(eventModel:EventModel):Observable<EventModel>{
    return this.http.post<EventModel>(`${this.api}create`, eventModel)
  }
}
