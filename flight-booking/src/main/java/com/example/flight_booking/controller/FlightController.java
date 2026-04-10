package com.example.flight_booking.controller;

import com.example.flight_booking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/{flightNumber}/book")
    public String bookSeats(@PathVariable String flightNumber,
                            @RequestParam int seats) {
        return flightService.bookSeats(flightNumber, seats);
    }
}