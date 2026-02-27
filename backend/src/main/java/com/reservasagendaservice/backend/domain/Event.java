package com.reservasagendaservice.backend.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Event {

    //private Long id;
    private String eventName;
    private String description;
    private Date startDate;
    private Date endDate;
}
