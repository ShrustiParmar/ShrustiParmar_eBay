package com.example.flight_booking.controller;

import com.example.flight_booking.dto.BookingRequest;
import com.example.flight_booking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/{flightNumber}/book")
    public ResponseEntity<String> bookSeats(
            @PathVariable String flightNumber,
            @RequestBody BookingRequest request) {

        String result = flightService.bookSeats(flightNumber, request.getSeats());

        if (result.equals("Booking successful")) {
            return ResponseEntity.ok(result); // 200
        } else if (result.equals("Flight not found")) {
            return ResponseEntity.status(404).body(result); // Not Found
        } else {
            return ResponseEntity.badRequest().body(result); // 400
        }
    }
}