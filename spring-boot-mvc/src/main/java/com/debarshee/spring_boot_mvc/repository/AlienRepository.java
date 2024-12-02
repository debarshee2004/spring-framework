package com.debarshee.spring_boot_mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debarshee.spring_boot_mvc.model.AlienModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlienRepository extends JpaRepository<AlienModel, Integer> {

    @Query("FROM AlienModel WHERE alien_name = :name")
    List<AlienModel> find(@Param("name") String alienName);
}
