package com.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.models.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
