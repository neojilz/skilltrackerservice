package com.skilltrack.skilltracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.skilltrack.skilltracker.model.Associate;

public interface AssociateRepository extends  JpaRepository<Associate, Integer> {

}
