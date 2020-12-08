package daos;

import java.util.List;

import models.Employee;

public interface EmployeeDAO {
	
	public Employee getEmployee(int id);
	public List <Employee> getAllEmployees();
	public boolean addEmployee(Employee e);
	public boolean updateEmployee(Employee e);
	public boolean deleteEmployee(int id);

}
