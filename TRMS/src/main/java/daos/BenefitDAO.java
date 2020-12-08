package daos;

import java.util.List;

import models.Benefits;

public interface BenefitDAO {

	public Benefits getBenefits(int employeeId);
	public List <Benefits> getALLbenefits();
	public boolean addBenefits(Benefits b);
	public boolean updateBenefits(Benefits change);
	public boolean deleteBenefits(int employeeId);
}
