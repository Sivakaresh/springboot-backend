package com.management.staff.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.staff.entity.StaffEntity;

public interface StaffRepository extends JpaRepository<StaffEntity, Integer> {

}
