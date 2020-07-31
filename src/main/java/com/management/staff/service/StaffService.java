package com.management.staff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.staff.entity.StaffEntity;
import com.management.staff.repository.StaffRepository;

@Service
public class StaffService {
	@Autowired
	private StaffRepository staffRepository;

	public List<StaffEntity> getAllStaffs() {
		return staffRepository.findAll();
	}

	public StaffEntity getStaffById(int id) {
		return staffRepository.findById(id).orElse(null);
	}

	public StaffEntity saveStaff(StaffEntity staffEntity) {
		return staffRepository.save(staffEntity);
	}

	public StaffEntity updateStaff(StaffEntity staffEntity) {
		StaffEntity oldStaffEntity = staffRepository.findById(staffEntity.getStaffId()).orElse(null);
		oldStaffEntity.setAddress(staffEntity.getAddress());
		oldStaffEntity.setCity(staffEntity.getCity());
		oldStaffEntity.setEmail(staffEntity.getEmail());
		oldStaffEntity.setGender(staffEntity.getGender());
		oldStaffEntity.setPassword(staffEntity.getPassword());
		oldStaffEntity.setStaffName(staffEntity.getStaffName());
		oldStaffEntity.setState(staffEntity.getState());
		oldStaffEntity.setZip(staffEntity.getZip());

		return staffRepository.save(oldStaffEntity);

	}

	public List<StaffEntity> deleteStaff(int id) {
		staffRepository.deleteById(id);
		return staffRepository.findAll();
	}

}
