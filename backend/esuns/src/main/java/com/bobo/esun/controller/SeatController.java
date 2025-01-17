package com.bobo.esun.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bobo.esun.model.Seat;
import com.bobo.esun.service.SeatService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/seats")
public class SeatController {
	
	private SeatService seatService;
	
	@GetMapping
	public ResponseEntity<List<Seat>> getAllSeats(){
		List<Seat> seats = seatService.getAllSeats();
		return new ResponseEntity<>(seats, HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Seat> updateEmp(@PathVariable("id") Integer id, @RequestBody Seat seat){
		seat.setFloor_seat_seq(id);
		Seat updatedSeat = seatService.updateSeat(seat);
		return new ResponseEntity<>(updatedSeat, HttpStatus.OK);
	}
}
