package service;

import java.util.List;

import daos.DeptDAO;
import daos.DeptDAOim;
import models.Dept;

public class DeptService {
	
	public static DeptDAO dd = new DeptDAOim();
	
	public static Dept getDept(int id) {
		
		return dd.getDept(id);
	}

	public static List <Dept> getAllDepts(){
		
		return dd.getALLDepts();
	}
	
	public static boolean addDept(Dept d) {
		
		return dd.addDept(d);
	}
	
	public static boolean updateDept(Dept change) {
		
		return dd.updateDept(change);
	}
	
	public static boolean deleteDept(int id) {
		
		return dd.deleteDept(id);
	}
}
