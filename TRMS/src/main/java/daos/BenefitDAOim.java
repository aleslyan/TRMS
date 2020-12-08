package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Benefits;

import util.JDBCConnection;

public class BenefitDAOim implements BenefitDAO {

	public static Connection conn = JDBCConnection.getConnection();
	@Override
	public Benefits getBenefits(int employeeId) {
		try {
			String sql = "SELECT * FROM benefit_balance WHERE employee_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(employeeId));
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				Benefits b = new Benefits();
				b.setEmployeeId(employeeId);
				b.setStartBal(rs.getDouble("START_BAL"));
				b.setAwardedDollars(rs.getDouble("AWARDED_DOLLARS"));
				b.setAvaDollars(rs.getDouble("AVA_DOLLARS"));
				b.setPendDollars(rs.getDouble("PENDING_DOLLAR"));
				
				return b;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Benefits> getALLbenefits() {
		
		try {
			String  sql = "SELECT * FROM benefit_balance";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List<Benefits> benefits = new ArrayList<Benefits>();
			
			while(rs.next()) {
				Benefits b = new Benefits();
				
				b.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				b.setStartBal(rs.getDouble("START_BAL"));
				b.setAwardedDollars(rs.getDouble("AWARDED_DOLLARS"));
				b.setAvaDollars(rs.getDouble("AVA_DOLLARS"));
				b.setPendDollars(rs.getDouble("PENDING_DOLLARS"));
				benefits.add(b);
				
			}
			return benefits;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public boolean addBenefits(Benefits b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBenefits(Benefits change) {
		try {
			
			String sql = "UPDATE benefit_balance SET pending_dollar = ?, SET awarded_dollars = ?, SET ava_dollars =? WHERE employee_id =?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setDouble(1, change.getPendDollars());
			ps.setDouble(2, change.getAwardedDollars());
			ps.setDouble(3, change.getAvaDollars());
			ps.setInt(4, change.getEmployeeId());
			
			ps.executeQuery();
			return true;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteBenefits(int employeeId) {
		try {
			String sql = "DELETE benefit_balance WHERE employee_Id = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(employeeId));
			ps.execute();
			return true;
					
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
