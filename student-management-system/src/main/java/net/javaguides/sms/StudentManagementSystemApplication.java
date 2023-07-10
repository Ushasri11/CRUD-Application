package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{
	/* this is a springboot main entrypoint class. Here we implement CommandLineRunner interface , this provides a method called run. 
	 Run method executes when we run the springboot application */

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	/* Logic to insert few student records here given example is if we want to add students in the code base and not through localhost
	  and i have commented it bcz i have implemented a functionality to add students via chrome page  */
	// we are injecting studentRepository object here as we use methods of that
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("tony", "stark", "tony@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}