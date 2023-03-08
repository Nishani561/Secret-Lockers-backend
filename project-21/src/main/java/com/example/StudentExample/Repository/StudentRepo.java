package com.example.StudentExample.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentExample.Entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

}