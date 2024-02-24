package com.krtdevops.springbootreactjsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krtdevops.springbootreactjsdemo.model.Student;

import java.util.Optional;

/**
 * @author KRTDevOps
 */

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
}
