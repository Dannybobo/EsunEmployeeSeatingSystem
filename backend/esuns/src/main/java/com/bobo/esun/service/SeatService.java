package com.bobo.esun.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bobo.esun.model.Seat;

@Service
public interface SeatService {
	List<Seat> getAllSeats();
	Seat updateSeat(Seat seat);
}
