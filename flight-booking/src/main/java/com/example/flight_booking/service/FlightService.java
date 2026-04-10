package com.example.flight_booking.service;

import com.example.flight_booking.model.Flight;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FlightService {

    private Map<String, Flight> flights = new HashMap<>();

    public FlightService() {
        // Sample flight
        flights.put("ABC123", new Flight("ABC123", 10));
    }

    public synchronized String bookSeats(String flightNumber, int seats) {

        Flight flight = flights.get(flightNumber);

        if (flight == null) {
            return "Flight not found";
        }

        if (seats <= 0) {
            return "Invalid seat count";
        }

        if (flight.getBookedSeats() + seats > flight.getCapacity()) {
            return "Not enough seats available";
        }

        flight.setBookedSeats(flight.getBookedSeats() + seats);

        return "Booking successful";
    }
}