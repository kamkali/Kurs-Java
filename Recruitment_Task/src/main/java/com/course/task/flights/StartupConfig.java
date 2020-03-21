package com.course.task.flights;

import com.course.task.flights.flight.FlightEntity;
import com.course.task.flights.flight.FlightRepository;
import com.course.task.flights.tourist.TouristEntity;
import com.course.task.flights.tourist.TouristRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class StartupConfig implements ApplicationRunner {
    private TouristRepository touristRepository;
    private FlightRepository flightRepository;

    @Autowired
    public StartupConfig(TouristRepository touristRepository, FlightRepository flightRepository) {
        this.touristRepository = touristRepository;
        this.flightRepository = flightRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//        LocalDateTime dateTime = formatter.parse();

        FlightEntity flight = new FlightEntity(LocalDateTime.of(date, time), LocalDateTime.of(date, time), 255, 134.5, Collections.emptyList());
        List<FlightEntity> flightList = new ArrayList<>();
        flightList.add(flight);

        flightRepository.save(flight);

        TouristEntity tourist1 = new TouristEntity("Kamil", "Kaliś", "M", "Poland",
                LocalDate.of(1998, Month.MAY, 7), Collections.emptyList());

        touristRepository.save(tourist1);
    }
}
