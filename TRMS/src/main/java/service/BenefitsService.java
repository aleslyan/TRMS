package service;

import java.util.List;

import daos.BenefitDAO;
import daos.BenefitDAOim;
import models.Benefits;

public class BenefitsService {
	
	public static BenefitDAO bd = new BenefitDAOim();
	
	public static Benefits getBenefits(int employeeId) {
		return bd.getBenefits(employeeId);
	}
	
	public static List <Benefits> getAllBenefits(){
		
		return bd.getALLbenefits();
	}

	public static boolean addBenefits(Benefits b) {
		
		return bd.addBenefits(b);
	}
	
	public static boolean updateBenefits(Benefits change) {
		
		return bd.updateBenefits(change);
	}
	
	public static boolean deleteBenefits(int employeeId) {
		
		return bd.deleteBenefits(employeeId);
	}
	
}
