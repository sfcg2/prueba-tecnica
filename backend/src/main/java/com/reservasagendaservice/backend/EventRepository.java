package com.reservasagendaservice.backend;

import com.reservasagendaservice.backend.DTO.EventMapper;
import java.util.List;
import java.util.stream.Collectors;

public class EventRepository implements IRepository{


    private final SpringRepositoryPersistence springRepositoryPersistence;

    public EventRepository(SpringRepositoryPersistence springRepositoryPersistence) {
        this.springRepositoryPersistence = springRepositoryPersistence;
    }

    @Override
    public List<Event> getAllEvents() {

        List<EventModel> model = springRepositoryPersistence.findAll();
        return model.stream()
                .map(EventMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EventModel save(Event newEvent) {
        return springRepositoryPersistence.save(EventMapper.toModel(newEvent));
    }
}
