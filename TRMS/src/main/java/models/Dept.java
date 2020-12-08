package models;

public class Dept {
	
	private int id;
	private String name;
	private Employee DeptHead;
	
	
	public Dept(int id, String name, Employee deptHead) {
		super();
		this.id = id;
		this.name = name;
		DeptHead = deptHead;
	}
	public Dept(String name, Employee deptHead) {
		super();
		this.name = name;
		DeptHead = deptHead;
	}
	public Dept() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getDeptHead() {
		return DeptHead;
	}
	public void setDeptHead(Employee deptHead) {
		DeptHead = deptHead;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", DeptHead=" + DeptHead + "]";
	}
	
	
	

}
