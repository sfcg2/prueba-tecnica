package com.reservasagendaservice.backend.application.services;

import com.reservasagendaservice.backend.domain.Event;
import com.reservasagendaservice.backend.infraestructure.persistence.EventModel;
import com.reservasagendaservice.backend.domain.IRepository;
import com.reservasagendaservice.backend.application.dto.EventMapper;

import java.util.List;

@org.springframework.stereotype.Service
public class EventService {


    private final IRepository iRepository;

    public EventService(IRepository iRepository) {
        this.iRepository = iRepository;
    }


    //1. GET

    public List<Event> getAll() {

        return iRepository.getAllEvents();
    }

    //2. POST

    public Event createEvent(Event request) {

        Event newEvent = new Event();

        newEvent.setEventName(request.getEventName());
        newEvent.setDescription(request.getDescription());
        newEvent.setStartDate(request.getStartDate());
        newEvent.setEndDate(request.getEndDate());

        EventModel savedEvent = iRepository.save(newEvent);
        return EventMapper.toDTO(savedEvent);
    }


    //3.PUT

    //4. DELETE
}
