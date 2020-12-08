package models;

import java.util.Date;

public class Request {
	
	private int id;
	private Date date;
	private Employee requestor;
	private Dept dept;
	
	private Course course;
	private GradingFormat gradeForm;
	private EventType eventType;
	
	
	
	private double projectedReimb;
	private Benefits benefits;
	
	
	private String justifcation;
	private boolean urgent;
	private StatusCode status;
	private boolean supApproved;
	private boolean dhApproved;
	private boolean bcApproved;
	private boolean addInfo;
	private boolean passGrade;
	
	
	
	public Request() {
		super();
	}


	public Request(Date date, Employee requestor, Dept dept, Course course, GradingFormat gradeForm,
			EventType eventType, double projectedReimb, Benefits benefits, String justifcation, boolean urgent,
			StatusCode status, boolean supApproved, boolean dhApproved, boolean bcApproved, boolean addInfo,
			boolean passGrade) {
		super();
		this.date = date;
		this.requestor = requestor;
		this.dept = dept;
		this.course = course;
		this.gradeForm = gradeForm;
		this.eventType = eventType;
		this.projectedReimb = projectedReimb;
		this.benefits = benefits;
		this.justifcation = justifcation;
		this.urgent = urgent;
		this.status = status;
		this.supApproved = supApproved;
		this.dhApproved = dhApproved;
		this.bcApproved = bcApproved;
		this.addInfo = addInfo;
		this.passGrade = passGrade;
	}


	public Request(int id, Date date, Employee requestor, Dept dept, Course course, GradingFormat gradeForm,
			EventType eventType, double projectedReimb, Benefits benefits, String justifcation, boolean urgent,
			StatusCode status, boolean supApproved, boolean dhApproved, boolean bcApproved, boolean addInfo,
			boolean passGrade) {
		super();
		this.id = id;
		this.date = date;
		this.requestor = requestor;
		this.dept = dept;
		this.course = course;
		this.gradeForm = gradeForm;
		this.eventType = eventType;
		this.projectedReimb = projectedReimb;
		this.benefits = benefits;
		this.justifcation = justifcation;
		this.urgent = urgent;
		this.status = status;
		this.supApproved = supApproved;
		this.dhApproved = dhApproved;
		this.bcApproved = bcApproved;
		this.addInfo = addInfo;
		this.passGrade = passGrade;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Employee getRequestor() {
		return requestor;
	}


	public void setRequestor(Employee requestor) {
		this.requestor = requestor;
	}


	public Dept getDept() {
		return dept;
	}


	public void setDept(Dept dept) {
		this.dept = dept;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public GradingFormat getGradeForm() {
		return gradeForm;
	}


	public void setGradeForm(GradingFormat gradeForm) {
		this.gradeForm = gradeForm;
	}


	public EventType getEventType() {
		return eventType;
	}


	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}


	public double getProjectedReimb() {
		return projectedReimb;
	}


	public void setProjectedReimb(double projectedReimb) {
		this.projectedReimb = projectedReimb;
	}


	public Benefits getBenefits() {
		return benefits;
	}


	public void setBenefits(Benefits benefits) {
		this.benefits = benefits;
	}


	public String getJustifcation() {
		return justifcation;
	}


	public void setJustifcation(String justifcation) {
		this.justifcation = justifcation;
	}


	public boolean isUrgent() {
		return urgent;
	}


	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}


	public StatusCode getStatus() {
		return status;
	}


	public void setStatus(StatusCode status) {
		this.status = status;
	}


	public boolean isSupApproved() {
		return supApproved;
	}


	public void setSupApproved(boolean supApproved) {
		this.supApproved = supApproved;
	}


	public boolean isDhApproved() {
		return dhApproved;
	}


	public void setDhApproved(boolean dhApproved) {
		this.dhApproved = dhApproved;
	}


	public boolean isBcApproved() {
		return bcApproved;
	}


	public void setBcApproved(boolean bcApproved) {
		this.bcApproved = bcApproved;
	}


	public boolean isAddInfo() {
		return addInfo;
	}


	public void setAddInfo(boolean addInfo) {
		this.addInfo = addInfo;
	}


	public boolean isPassGrade() {
		return passGrade;
	}


	public void setPassGrade(boolean passGrade) {
		this.passGrade = passGrade;
	}


	@Override
	public String toString() {
		return "Request [id=" + id + ", date=" + date + ", requestor=" + requestor + ", dept=" + dept + ", course="
				+ course + ", gradeForm=" + gradeForm + ", eventType=" + eventType + ", projectedReimb="
				+ projectedReimb + ", benefits=" + benefits + ", justifcation=" + justifcation + ", urgent=" + urgent
				+ ", status=" + status + ", supApproved=" + supApproved + ", dhApproved=" + dhApproved + ", bcApproved="
				+ bcApproved + ", addInfo=" + addInfo + ", passGrade=" + passGrade + "]";
	}
	
	

	
}
