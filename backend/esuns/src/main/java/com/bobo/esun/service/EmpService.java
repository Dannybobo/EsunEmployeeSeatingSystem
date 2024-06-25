package com.bobo.esun.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bobo.esun.model.Emp;

@Service
public interface EmpService {
	List<Emp> getAllEmps();
	Emp updateEmp(Emp emp);
}
