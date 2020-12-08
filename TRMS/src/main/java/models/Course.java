package models;

import java.sql.Date;

public class Course {
	
	private int id;
	private int eventType;
	private String courseName;
	private String schoolName;
	private String schoolStreet;
	private String schoolCity;
	private String schoolState;
	private int schoolZip;
	private Date startDate;
	private double cost;
	private int gradeFormat;
	private boolean verified;
	
	
	public Course(int id, int eventType, String courseName, String schoolName, String schoolStreet,
			String schoolCity, String schoolState, int schoolZip, Date startDate, double cost,
			int gradeFormat, boolean verified) {
		super();
		this.id = id;
		this.eventType = eventType;
		this.courseName = courseName;
		this.schoolName = schoolName;
		this.schoolStreet = schoolStreet;
		this.schoolCity = schoolCity;
		this.schoolState = schoolState;
		this.schoolZip = schoolZip;
		this.startDate = startDate;
		this.cost = cost;
		this.gradeFormat = gradeFormat;
		this.verified = verified;
	}


	public Course(int eventType, String courseName, String schoolName, String schoolStreet, String schoolCity,
			String schoolState, int schoolZip, Date startDate, double cost, int gradeFormat,
			boolean verified) {
		super();
		this.eventType = eventType;
		this.courseName = courseName;
		this.schoolName = schoolName;
		this.schoolStreet = schoolStreet;
		this.schoolCity = schoolCity;
		this.schoolState = schoolState;
		this.schoolZip = schoolZip;
		this.startDate = startDate;
		this.cost = cost;
		this.gradeFormat = gradeFormat;
		this.verified = verified;
	}


	public Course() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getEventType() {
		return eventType;
	}


	public void setEventType(int eventType) {
		this.eventType = eventType;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getSchoolStreet() {
		return schoolStreet;
	}


	public void setSchoolStreet(String schoolStreet) {
		this.schoolStreet = schoolStreet;
	}


	public String getSchoolCity() {
		return schoolCity;
	}


	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}


	public String getSchoolState() {
		return schoolState;
	}


	public void setSchoolState(String schoolState) {
		this.schoolState = schoolState;
	}


	public int getSchoolZip() {
		return schoolZip;
	}


	public void setSchoolZip(int schoolZip) {
		this.schoolZip = schoolZip;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public int getGradeFormat() {
		return gradeFormat;
	}


	public void setGradeFormat(int gradeFormat) {
		this.gradeFormat = gradeFormat;
	}


	public boolean isVerified() {
		return verified;
	}


	public void setVerified(boolean verified) {
		this.verified = verified;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", eventType=" + eventType + ", courseName=" + courseName + ", schoolName="
				+ schoolName + ", schoolStreet=" + schoolStreet + ", schoolCity=" + schoolCity + ", schoolState="
				+ schoolState + ", schoolZip=" + schoolZip + ", startDate=" + startDate + ", cost=" + cost
				+ ", gradeFormat=" + gradeFormat + ", verified=" + verified + "]";
	}
	
	
	
	

}
