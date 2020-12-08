package daos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import models.Employee;
import util.JDBCConnection;

public class EmployeeDAOim implements EmployeeDAO {

	public static Connection conn = JDBCConnection.getConnection();

	@Override
	public Employee getEmployee(int id) {
		try {

			String sql = "SELECT * FROM employee WHERE employee_id = ?";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, Integer.toString(id));

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Employee a = new Employee();

				a.setId(rs.getInt("EMPLOYEE_ID"));
				a.setfName(rs.getString("F_NAME"));
				a.setlName(rs.getString("L_Name"));
				a.setDept(rs.getInt("DEPT_ID"));
				a.setSupervisor(rs.getInt("DIRECT_SUP"));
				a.setPassword(rs.getString("PASSWORD"));
				a.setBen_co(rs.getBoolean("IS_BEN_CO"));
				a.setIsSupervisor(rs.getBoolean("IS_SUPERVISOR"));
				a.setDeptHead(rs.getBoolean("IS_DEPT_HEAD"));

				return a;

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		try {
			String sql = "SELECT * FROM employee";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			List<Employee> employees = new ArrayList<Employee>();

			while (rs.next()) {

				Employee a = new Employee();
				a.setId(rs.getInt("EMPLOYEE_ID"));
				a.setfName(rs.getString("F_NAME"));
				a.setlName(rs.getString("L_Name"));
				a.setDept(rs.getInt("DEPT_ID"));
				a.setSupervisor(rs.getInt("DIRECT_SUP"));
				a.setPassword(rs.getString("PASSWORD"));
				a.setBen_co(rs.getBoolean("IS_BEN_CO"));
				a.setIsSupervisor(rs.getBoolean("IS_SUPERVISOR"));
				a.setDeptHead(rs.getBoolean("IS_DEPT_HEAD"));

				employees.add(a);
				return employees;
			}
		} catch (SQLException e) {

		}

		return null;
	}

	@Override
	public boolean addEmployee(Employee a) {
		try {

			String sql = "CALL add_employee(?,?,?,?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, a.getfName());
			cs.setString(2, a.getlName());
			cs.setString(3, Integer.toString(a.getDept()));
			cs.setString(4, Integer.toString(a.getSupervisor()));
			cs.setString(5, a.getPassword());
			cs.setString(6, Boolean.toString(a.isBen_co()));
			cs.setString(7, Boolean.toString(a.isSupervisor()));
			cs.setString(8, Boolean.toString(a.isDeptHead()));

			cs.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee change) {
		
		try {
			String sql = "UPDATE employee SET f_name = ?, l_name = ?, dept_id = ?, direct_sup = ?, password = ?, is_ben_co = ?, is_supervisor = ?, is_dept_head = ?, WHERE employee_id = ?";
		
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, change.getfName());
			ps.setString(2, change.getlName());
			ps.setString(3, Integer.toString(change.getDept()));
			ps.setString(4, Integer.toString(change.getSupervisor()));
			ps.setString(5, change.getPassword());
			ps.setString(6, Boolean.toString(change.isBen_co()));
			ps.setString(7, Boolean.toString(change.isSupervisor()));
			ps.setString(8, Boolean.toString(change.isDeptHead()));
			ps.setString(9, Integer.toString(change.getId()));
			
			ps.executeQuery();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean deleteEmployee(int id) {
	try {
			
			String sql = "DELETE employee  WHERE employee_id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(id));
			
			ps.execute();
			return true;
			
		}catch (SQLException e) {
			e.printStackTrace();
		return false;
	}
	}
}

