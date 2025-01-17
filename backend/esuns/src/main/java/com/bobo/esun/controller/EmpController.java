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

import com.bobo.esun.model.Emp;
import com.bobo.esun.service.EmpService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/emps")
public class EmpController {
	
	private EmpService empService;
	
	@GetMapping
	public ResponseEntity<List<Emp>> getAllEmps(){
		List<Emp> emps = empService.getAllEmps();
		return new ResponseEntity<>(emps, HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Emp> updateEmp(@PathVariable("id") Long id, @RequestBody Emp emp){
		emp.setId(id);
		Emp updatedEmp = empService.updateEmp(emp);
		return new ResponseEntity<>(updatedEmp, HttpStatus.OK);
	}
}
