package com.reservasagendaservice.backend;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Event {

    private Number id;
    private String eventName;
    private String description;
    private Date startDate;
    private Date endDate;
}
