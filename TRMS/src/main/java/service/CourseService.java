package service;

import java.util.List;

import daos.CourseDAO;
import daos.CourseDAOim;
import models.Course;

public class CourseService {
	
	public static CourseDAO cd = new CourseDAOim();
	
	public static Course getCourse(int id) {
		
		return cd.getCourse(id);
	}
	
	
	public static List <Course> getAllCourses(){
		
		return cd.getAllCourses();
	}
	
	public static boolean addCourse(Course c) {
		
		return cd.addCourse(c);
	}

	public static boolean updateCourse(Course change) {
		
		return cd.updateCourse(change);
	}
	
	public static boolean deleteCourse(int id) {
		return cd.deleteCourse(id);
	}
}
