package com.reservasagendaservice.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SpringRepositoryPersistence extends JpaRepository<EventModel, Long> {
    List<EventModel> findAll();

}
