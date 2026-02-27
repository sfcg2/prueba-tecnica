package com.reservasagendaservice.backend.application.dto;

import com.reservasagendaservice.backend.domain.Event;
import com.reservasagendaservice.backend.infraestructure.persistence.EventModel;

public class EventMapper {

//convertirmos lo que llega del frontend a tomodel para guardar en la base de datos

    public static EventModel toModel(Event event) {

       EventModel model = new EventModel();

       model.setEventName(event.getEventName());
       model.setDescription(event.getDescription());
       model.setStartDate(event.getStartDate());
       model.setEndDate(event.getEndDate());

        return model;
    }
// convertirmos lo de la base de datos a toDTO para mostrar en el frontend

    public static Event toDTO(EventModel model) {

        Event event = new Event();

        event.setEventName(model.getEventName());
        event.setDescription(model.getDescription());
        event.setStartDate(model.getStartDate());
        event.setEndDate(model.getEndDate());

        return event;
    }
}
