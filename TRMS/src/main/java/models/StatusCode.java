package models;

public class StatusCode {

	private int id;
	private String status;
	private String description;
	private String nextStep;
	
	
	public StatusCode(int id, String status, String description, String nextStep) {
		super();
		this.id = id;
		this.status = status;
		this.description = description;
		this.nextStep = nextStep;
	}


	public StatusCode(String status, String description, String nextStep) {
		super();
		this.status = status;
		this.description = description;
		this.nextStep = nextStep;
	}


	public StatusCode() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getNextStep() {
		return nextStep;
	}


	public void setNextStep(String nextStep) {
		this.nextStep = nextStep;
	}


	@Override
	public String toString() {
		return "StatusCode [id=" + id + ", status=" + status + ", description=" + description + ", nextStep=" + nextStep
				+ "]";
	}
	
	
}
