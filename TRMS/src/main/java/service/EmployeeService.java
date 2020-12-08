package service;

import java.util.List;

import daos.EmployeeDAO;
import daos.EmployeeDAOim;
import models.Employee;

public class EmployeeService {
	
	public static EmployeeDAO  ed = new EmployeeDAOim();
	
	public static Employee getEmployee(int id) {
		
		return ed.getEmployee(id);
	}
	
	public static List <Employee> getAllEmployees(){
		
		return ed.getAllEmployees();
	}
	
	public static boolean addEmployee(Employee e) {
		
		return ed.addEmployee(e);
	}

	public static boolean updateEmployee(Employee e) {
		
		return ed.updateEmployee(e);
	}
	
	public static boolean deleteEmployee(int id) {
		
		return ed.deleteEmployee(id);
	}
}
