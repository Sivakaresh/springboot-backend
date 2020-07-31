package com.management.staff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.management.staff.entity.StaffEntity;
import com.management.staff.service.StaffService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StaffController {
	@Autowired
	private StaffService staffService;

	@GetMapping("/view")
	public List<StaffEntity> viewAllStaff() {
		return staffService.getAllStaffs();
	}

	@GetMapping("/view/{id}")
	public StaffEntity viewStaff(@PathVariable int id) {
		return staffService.getStaffById(id);
	}

	@PostMapping("/add")
	public StaffEntity storeStaff(@RequestBody StaffEntity staffEntity) {
		return staffService.saveStaff(staffEntity);
	}

	@DeleteMapping("delete/{id}")
	public List<StaffEntity> removeStaff(@PathVariable int id) {
		return staffService.deleteStaff(id);
	}

	@PutMapping("/update")
	public StaffEntity editStaff(@RequestBody StaffEntity staffEntity) {
		return staffService.updateStaff(staffEntity);
	}

}
