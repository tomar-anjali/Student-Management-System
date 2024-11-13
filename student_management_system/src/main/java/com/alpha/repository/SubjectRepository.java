package com.alpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.models.entity.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
