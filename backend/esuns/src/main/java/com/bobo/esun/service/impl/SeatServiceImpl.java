package com.bobo.esun.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bobo.esun.model.Seat;
import com.bobo.esun.repository.SeatRepository;
import com.bobo.esun.service.SeatService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SeatServiceImpl implements SeatService {
	private SeatRepository seatRepository;
	
	@Override
	public List<Seat> getAllSeats(){
		return seatRepository.findAll();
	}
	
	@Override
	public Seat updateSeat(Seat seat) {
		Seat existingSeat = seatRepository.findById(seat.getFloor_seat_seq()).get();
        existingSeat.setFloor_seat_seq(seat.getFloor_seat_seq());
        existingSeat.setFloor_no(seat.getFloor_no());
        existingSeat.setSeat_no(seat.getSeat_no());
        Seat updatedSeat = seatRepository.save(existingSeat);
        return updatedSeat;
    }
}
