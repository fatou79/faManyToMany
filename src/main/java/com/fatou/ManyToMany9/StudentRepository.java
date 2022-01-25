package com.fatou.ManyToMany9;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fatou.ManyToMany9.entity.Course;
import com.fatou.ManyToMany9.entity.Student;



@Repository
@Transactional
public class StudentRepository {
	
	private Logger fatou = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	EntityManager em;
	
	public Student  findById(Long id) {
		return em.find(Student.class, id);
	}
	
	public Student save(Student student) {
		if(student == null) {
			em.persist(student);
		}else {
			em.merge(student);
			}
		return student;
	}
	public void deletedById(Long id) {
		Student student = findById(id);
		em.remove(student);
	}
	
	public void insertHardcodeStudentANDCOURSE() {
		Student student = new Student("fatima");
		em.persist(student);
		
		Course course = new Course("Lean how to deplay");
		em.persist(course);
		em.persist(course);
		
		student.addCourses(course);
		course.addStudents(student);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
