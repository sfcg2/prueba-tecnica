package com.reservasagendaservice.backend.infraestructure.controller;

import com.reservasagendaservice.backend.application.services.EventService;
import com.reservasagendaservice.backend.domain.Event;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events/")
//@CrossOrigin(origins = "http://localhost:4200")
public class Controller {

    private final EventService eventService;

    public Controller(EventService eventService) {this.eventService = eventService;}

    @GetMapping("/")
    public ResponseEntity<List<Event>> getAll() {

        //asegurarse que la lista no sea nula
        List<Event> listEvents = eventService.getAll();
        return ResponseEntity.ok(listEvents);
    }

    @PostMapping("/create")
    public ResponseEntity<Event> create(@RequestBody Event newEvent) {

        //asegurarse que no devuelva nulo
        Event event = eventService.createEvent(newEvent);
        return ResponseEntity.status(HttpStatus.CREATED).body(event);
    }
}
