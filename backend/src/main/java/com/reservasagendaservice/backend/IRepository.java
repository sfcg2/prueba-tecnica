package com.reservasagendaservice.backend;

import java.util.List;

public interface IRepository {

    List<Event> getAllEvents();
    EventModel save(Event newEvent);
}
