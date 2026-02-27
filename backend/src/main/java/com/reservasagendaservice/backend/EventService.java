package com.reservasagendaservice.backend;

import com.reservasagendaservice.backend.DTO.EventMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


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
