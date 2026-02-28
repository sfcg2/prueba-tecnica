import {Component, OnInit} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {EventModel} from '../../eventModel';
import {EventService} from '../../services/eventService';

@Component({
  selector: 'app-add-events',
  imports: [
    FormsModule
  ],
  templateUrl: './add-events.html',
  styleUrl: './add-events.css',
})
export class AddEvents implements OnInit{

    eventName : string = "";
    description: string = "";
    startDate: string = "";
    endDate: string = "";

    constructor(private eventService: EventService) {

  }
  ngOnInit(): void {


    }

  addEvents(){

    const event = new EventModel(
      this.eventName,
      this.description,
      new Date(this.startDate),
      new Date(this.endDate)
    );

    console.log(event);
    this.eventService.postAddEvents(event).subscribe(
      res => console.log(res)
    );
  }

}
