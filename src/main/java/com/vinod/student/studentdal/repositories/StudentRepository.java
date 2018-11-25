package com.vinod.student.studentdal.repositories;

import com.vinod.student.studentdal.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
