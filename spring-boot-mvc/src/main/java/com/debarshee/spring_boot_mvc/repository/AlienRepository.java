package com.debarshee.spring_boot_mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debarshee.spring_boot_mvc.model.AlienModel;

public interface AlienRepository extends JpaRepository<AlienModel, Integer> {}
