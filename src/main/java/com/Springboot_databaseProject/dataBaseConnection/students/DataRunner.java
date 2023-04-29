package com.Springboot_databaseProject.dataBaseConnection.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataRunner implements CommandLineRunner{

	@Autowired
	private StudentData student;
	
	@Override
	public void run(String... args) throws Exception {
		//insertion
		student.insert(new Student(1,"Rahul",56.02f));
		student.insert(new Student(2,"Akash",96.0f));
		student.insert(new Student(3,"Ravi",84.2f));
		student.insert(new Student(4,"Dhruv",67.5f));
		student.insert(new Student(5,"Ravi",44.8f));
		//updating student 3 percentage
		 student.updateById( 82.5f,3);
		//deleting 4th student data 
		 student.DeleteById(4);
		 //selecting by id
		 System.out.println(student.SelectById(2));
		 System.out.println();
		 System.out.println(student.SelectById(3));
		 
	}

}
