package com.exam.EmpSystem.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.EmpSystem.Entity.Employee;



@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}
