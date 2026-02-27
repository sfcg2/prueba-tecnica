import { Component, OnInit } from '@angular/core';
import { EventService } from '../../services/eventService';

@Component({
  selector: 'app-list-events',
  imports: [],
  templateUrl: './list-events.html',
  styleUrl: './list-events.css',
})
export class ListEvents implements OnInit{

  event: Event[] = []; //crenacion de lista vacia tipo eventos deone se guardaran los eventos que venga desde el backend 
  
  constructor(private eventService: EventService) { }
  ngOnInit(): void {
    this.listEvents();
  }

  listEvents() { //se usa subscribe porque se uso observable en el servicio, se espera a que toda la data este disponible para mostrarla en el frontend
    this.eventService.getEventList().subscribe(
      data => {
        this.event = data;
        console.log(this.event);
      }
    );
  }
}
