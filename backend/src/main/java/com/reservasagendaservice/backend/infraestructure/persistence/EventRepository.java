package com.reservasagendaservice.backend.infraestructure.persistence;

import com.reservasagendaservice.backend.application.dto.EventMapper;
import com.reservasagendaservice.backend.domain.Event;
import com.reservasagendaservice.backend.domain.IRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EventRepository implements IRepository {


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
