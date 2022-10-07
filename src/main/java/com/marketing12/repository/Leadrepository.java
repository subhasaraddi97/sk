package com.marketing12.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing12.entites.Lead;

public interface Leadrepository extends JpaRepository<Lead, Long> {

}
