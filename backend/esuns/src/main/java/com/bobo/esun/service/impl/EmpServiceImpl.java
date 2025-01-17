package com.bobo.esun.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bobo.esun.model.Emp;
import com.bobo.esun.repository.EmpRepository;
import com.bobo.esun.service.EmpService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmpServiceImpl implements EmpService {
	private EmpRepository empRepository;
	
	@Override
	public List<Emp> getAllEmps(){
		return empRepository.findAll();
	}
	
	@Override
	public Emp updateEmp(Emp emp) {
        Emp existingEmp = empRepository.findById(emp.getId()).get();
        existingEmp.setName(emp.getName());
        existingEmp.setEmail(emp.getEmail());
        existingEmp.setEid(emp.getEid());
        existingEmp.setFloor_seat_seq(emp.getFloor_seat_seq());
        Emp updatedEmp = empRepository.save(existingEmp);
        return updatedEmp;
    }
}
