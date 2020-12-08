package daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import models.Course;
import util.JDBCConnection;

public class CourseDAOim implements CourseDAO {
	
	public static Connection conn = JDBCConnection.getConnection();
	@Override
	public Course getCourse(int id) {
		try {
		String sql = "SELECT * FROM courses WHERE course_id =?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, Integer.toString(id));
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			Course c = new Course();
			c.setId(rs.getInt("COURSE_ID"));
			c.setEventType(rs.getInt("EVENT_TYPE"));
			c.setCourseName(rs.getString("COURSE_NAME"));
			c.setSchoolName(rs.getString("SCHOOL_NAME"));
			c.setSchoolStreet(rs.getString("SCHOOL_STREET"));
			c.setSchoolState(rs.getString("SCHOOL_STATE"));
			c.setSchoolZip(rs.getInt("SCHOOL_ZIP"));
			c.setStartDate(rs.getDate("START_DATE"));
			c.setCost(rs.getDouble("COST"));
			c.setGradeFormat(rs.getInt("GRADE_FORMAT"));
			c.setVerified(rs.getBoolean("VERIFIED"));
			
			return c;
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		try {
			String sql = "SELECT * FROM courses";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List <Course> courses = new ArrayList<Course>();
			while (rs.next()) {
				Course c = new Course();
				c.setId(rs.getInt("COURSE_ID"));
				c.setEventType(rs.getInt("EVENT_TYPE"));
				c.setCourseName(rs.getString("COURSE_NAME"));
				c.setSchoolName(rs.getString("SCHOOL_NAME"));
				c.setSchoolStreet(rs.getString("SCHOOL_STREET"));
				c.setSchoolState(rs.getString("SCHOOL_STATE"));
				c.setSchoolZip(rs.getInt("SCHOOL_ZIP"));
				c.setStartDate(rs.getDate("START_DATE"));
				c.setCost(rs.getDouble("COST"));
				c.setGradeFormat(rs.getInt("GRADE_FORMAT"));
				c.setVerified(rs.getBoolean("VERIFIED"));
				
				courses.add(c);
			}return courses;
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public boolean addCourse(Course c) {
		try {
			String sql = "CALL add_course(?,?,?,?,?,?,?,?,?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setInt(1, c.getEventType());
			cs.setString(2, c.getCourseName());
			cs.setString(3, c.getSchoolName());
			cs.setString(4, c.getSchoolStreet());
			cs.setString(5, c.getSchoolState());
			cs.setInt(6, c.getSchoolZip());
			cs.setDate(7, c.getStartDate());
			cs.setDouble(8,  c.getCost());
			cs.setInt(9, c.getGradeFormat());
			cs.setBoolean(10, c.isVerified());
			
			cs.execute();
			return true;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateCourse(Course change) {
		try {
			String sql = "UPDATE courses SET event_type=?, course_name=?, school_name=?, school_street=?, school_zip=?, start_date=?, cost=?, grade_format=?, verified =? WHERE course_id =?";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, change.getEventType());
			ps.setString(2, change.getCourseName());
			ps.setString(3, change.getSchoolName());
			ps.setString(4, change.getSchoolStreet());
			ps.setString(5, change.getSchoolState());
			ps.setInt(6, change.getSchoolZip());
			ps.setDate(7, change.getStartDate());
			ps.setDouble(8,  change.getCost());
			ps.setInt(9, change.getGradeFormat());
			ps.setBoolean(10, change.isVerified());
			ps.setInt(11, change.getId());
					
			ps.executeQuery();
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCourse(int id) {
		try {
			String sql = "DELETE courses WHERE course_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,  Integer.toString(id));
			ps.execute();
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	
}
