package com.Springboot_databaseProject.dataBaseConnection.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentData {

	@Autowired
	private JdbcTemplate springTempo;
	//this object is gonna help to update the database
	
	//insert query
	private static String Insert_qry = 
			"""
			insert into Students(id,name,Percentage)
			values(?,?,?);
			""";
	//update query
	private static String update_qry = 
			"""
			update Students set Percentage = ?
			where id = ?;
			""";
	//delete query
	private static String dlt_qry = 
			"""
			delete from Students 
			where id = ?;
			""";
	//select query
	private static String slt_qry = 
			"""
			Select * from Students 
			where id=?
			""";
	
	public void insert(Student stud) {
		springTempo.update(Insert_qry,stud.getId(),stud.getName(),stud.getPerctage());
	}
	public void updateById(float Perctage,int id) {
		springTempo.update(update_qry,Perctage,id);
	}
	public void DeleteById(int id) {
		springTempo.update(dlt_qry,id);
	}
	public Student SelectById(int id) {
		return springTempo.queryForObject(slt_qry,new BeanPropertyRowMapper<>(Student.class) ,id);
	}
	
	
	
	
	

}
