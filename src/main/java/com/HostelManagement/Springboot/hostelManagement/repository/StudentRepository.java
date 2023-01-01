package com.HostelManagement.Springboot.hostelManagement.repository;

import com.HostelManagement.Springboot.hostelManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student,String> {
}
