package models;

public class Benefits {
	
	private int employeeId;
	private double startBal;
	private double pendDollars;
	private double awardedDollars;
	private double avaDollars;
	
	public Benefits(int employeeId, double startBal, double pendDollars, double awardedDollars,
			double avaDollars) {
		super();
		this.employeeId = employeeId;
		this.startBal = startBal;
		this.pendDollars = pendDollars;
		this.awardedDollars = awardedDollars;
		this.avaDollars = avaDollars;
	}

	public Benefits() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getStartBal() {
		return startBal;
	}

	public void setStartBal(double startBal) {
		this.startBal = startBal;
	}

	public double getPendDollars() {
		return pendDollars;
	}

	public void setPendDollars(double pendDollars) {
		this.pendDollars = pendDollars;
	}

	public double getAwardedDollars() {
		return awardedDollars;
	}

	public void setAwardedDollars(double awardedDollars) {
		this.awardedDollars = awardedDollars;
	}

	public double getAvaDollars() {
		return avaDollars;
	}

	public void setAvaDollars(double avaDollars) {
		this.avaDollars = avaDollars;
	}

	@Override
	public String toString() {
		return "Benefits [employeeId=" + employeeId + ", startBal=" + startBal + ", pendDollars=" + pendDollars
				+ ", awardedDollars=" + awardedDollars + ", avaDollars=" + avaDollars + "]";
	}
	
	


}
