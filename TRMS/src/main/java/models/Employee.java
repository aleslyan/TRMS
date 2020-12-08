package models;

public class Employee {

	private int id;
	private String fName;
	private String lName;
	private int dept;
	private int supervisor;
	private String password;
	private boolean ben_co;
	private boolean isSupervisor;
	private boolean isDeptHead;
	private Benefits benefits;
	
	
	public Employee(int id, String fName, String lName, int dept, int supervisor, String password, boolean ben_co,
			boolean isSupervisor, boolean isDeptHead, Benefits benefits) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dept = dept;
		this.supervisor = supervisor;
		this.password = password;
		this.ben_co = ben_co;
		this.isSupervisor = isSupervisor;
		this.isDeptHead = isDeptHead;
		this.benefits = benefits;
	}


	public Employee(String fName, String lName, int dept, int supervisor, String password, boolean ben_co,
			boolean isSupervisor, boolean isDeptHead, Benefits benefits) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.dept = dept;
		this.supervisor = supervisor;
		this.password = password;
		this.ben_co = ben_co;
		this.isSupervisor = isSupervisor;
		this.isDeptHead = isDeptHead;
		this.benefits = benefits;
	}


	public Employee() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public int getDept() {
		return dept;
	}


	public void setDept(int deptId) {
		this.dept = deptId;
	}


	public int getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(int id) {
		this.supervisor = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isBen_co() {
		return ben_co;
	}


	public void setBen_co(boolean ben_co) {
		this.ben_co = ben_co;
	}


	public boolean isSupervisor() {
		return isSupervisor;
	}


	public void setIsSupervisor(boolean isSupervisor) {
		this.isSupervisor = isSupervisor;
	}


	public boolean isDeptHead() {
		return isDeptHead;
	}


	public void setDeptHead(boolean isDeptHead) {
		this.isDeptHead = isDeptHead;
	}


	public Benefits getBenefits() {
		return benefits;
	}


	public void setBenefits(Benefits benefits) {
		this.benefits = benefits;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", dept=" + dept + ", supervisor="
				+ supervisor + ", password=" + password + ", ben_co=" + ben_co + ", isSupervisor=" + isSupervisor
				+ ", isDeptHead=" + isDeptHead + ", benefits=" + benefits + "]";
	}


	
	
	
	
	
	
}
