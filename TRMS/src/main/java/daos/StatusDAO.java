package daos;

import java.util.List;

import models.StatusCode;

public interface StatusDAO {
	
	public StatusCode getStatus(int id);
	public List <StatusCode> getAllStatusCodes();
	
	

}
