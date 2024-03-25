package com.prajapati.demo;
import com.prajapati.demo.model.Student;
import com.prajapati.demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		Student s=context.getBean(Student.class);
		s.setName("ankit");
		s.setMarks(56);
		s.setRollNo(10);
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> students=service.getStudents();
		System.out.println(students);
	}

}
