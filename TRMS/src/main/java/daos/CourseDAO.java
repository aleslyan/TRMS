package daos;

import java.util.List;


import models.Course;

public interface CourseDAO {

	public Course getCourse(int id);
	public List <Course> getAllCourses();
	public boolean addCourse(Course c);
	public boolean updateCourse(Course change);
	public boolean deleteCourse(int Id);

}
