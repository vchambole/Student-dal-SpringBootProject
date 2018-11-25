package com.vinod.student.studentdal;

import com.vinod.student.studentdal.entities.Student;
import com.vinod.student.studentdal.repositories.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {
	@Autowired
	private StudentRepository repository;

	@Test
	public void contextLoads() {
	}
	@Test
	public void testCreatStudent(){
		Student student = new Student();
		student.setSname("vinod");
		student.setCourse("springboot");
		student.setSfee(200d);

		repository.save(student);

	}
	@Test
	public void findStudent(){
		Optional<Student> student = repository.findById(1);
		student.ifPresent(student1 -> System.out.println(student1.getSname()));
	}

	@Test
	public void updateStudent(){
		Optional<Student> student = repository.findById(2);
		student.ifPresent(student1 -> student1.setSname("kumar"));
		System.out.println(student);
		repository.save(student.get());

	}

	@Test
	public void deleteStudent(){
		Student student = repository.findById(2).orElse(new Student());
		repository.delete(student);
	}

}
