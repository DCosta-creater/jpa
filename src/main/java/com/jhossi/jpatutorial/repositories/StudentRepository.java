package com.jhossi.jpatutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhossi.jpatutorial.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
  
}
