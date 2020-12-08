package daos;

import java.util.List;


import models.Dept;

public interface DeptDAO {
	

	public Dept getDept(int id);
	public List <Dept> getALLDepts();
	public boolean addDept(Dept d);
	public boolean updateDept(Dept change);
	public boolean deleteDept(int id);

}
