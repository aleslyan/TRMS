package models;

public class EventType {

	private int id;
	private String courseFormat;
	private double reimbursementRate;//decimal version of percent
	public EventType(int id, String courseFormat, double reimbursementRate) {
		super();
		this.id = id;
		this.courseFormat = courseFormat;
		this.reimbursementRate = reimbursementRate;
	}
	
	public EventType(String courseFormat, double reimbursementRate) {
		super();
		this.courseFormat = courseFormat;
		this.reimbursementRate = reimbursementRate;
	}

	public EventType() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseFormat() {
		return courseFormat;
	}

	public void setCourseFormat(String courseFormat) {
		this.courseFormat = courseFormat;
	}

	public double getReimbursementRate() {
		return reimbursementRate;
	}

	public void setReimbursementRate(double reimbursementRate) {
		this.reimbursementRate = reimbursementRate;
	}

	@Override
	public String toString() {
		return "EventType [id=" + id + ", courseFormat=" + courseFormat + ", reimbursementRate=" + reimbursementRate
				+ "]";
	}
	
	
	
	
	
}
