package com.reservasagendaservice.backend.infraestructure.exception;

public class EventNoFoundException extends RuntimeException {

    public EventNoFoundException() {
        super("El evento o eventos no fueron encontrados");
    }
}
