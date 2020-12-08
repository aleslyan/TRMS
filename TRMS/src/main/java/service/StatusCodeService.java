package service;

import java.util.List;

import daos.StatusDAO;
import daos.StatusDAOim;
import models.StatusCode;

public class StatusCodeService {
	
	public static StatusDAO sd = new StatusDAOim();
	
	public static StatusCode getStatus(int id) {
		
		return sd.getStatus(id);
	}

	public static List <StatusCode> getAllStatusCodes(){
		
		return sd.getAllStatusCodes();
	}

}
