package com.kushal.springjdbc;

import com.kushal.springjdbc.model.student;
import com.kushal.springjdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		student s = context.getBean(student.class);
		s.setName("Kushal");
		s.setMarks(90);
		s.setRollNo(20);

		student s2 = context.getBean(student.class);
		s2.setName("Kushal");
		s2.setMarks(90);
		s2.setRollNo(200);

		StudentService service = context.getBean(StudentService.class);
		service.add(s2);
		List<student> studentList = service.getStudents();
		System.out.println(studentList);
	}

}
