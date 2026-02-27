package com.reservasagendaservice.backend.domain;

import com.reservasagendaservice.backend.infraestructure.persistence.EventModel;

import java.util.List;

public interface IRepository {

    List<Event> getAllEvents();
    EventModel save(Event newEvent);
}
