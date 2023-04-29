package com.Springboot_databaseProject.dataBaseConnection.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentData {

	@Autowired
	private JdbcTemplate springTempo;
	//this object is gonna help to update the database
	
	private static String Insert_qry = 
			"""
			insert into Students(id,name,Percentage)
			values(?,?,?);
			""";
	private static String update_qry = 
			"""
			update Students set Percentage = ?
			where id = ?;
			""";
	
	public void insert(Student stud) {
		springTempo.update(Insert_qry,stud.getId(),stud.getName(),stud.getPerc());
	}
	public void updateById(float perc,int id) {
		springTempo.update(update_qry,perc,id);
	}
	
	
	
	
	

}
