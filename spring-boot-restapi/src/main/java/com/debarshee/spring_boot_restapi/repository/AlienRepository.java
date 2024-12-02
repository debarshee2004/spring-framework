package com.debarshee.spring_boot_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debarshee.spring_boot_restapi.model.AlienModel;

public interface AlienRepository extends JpaRepository<AlienModel, Integer> {
}
