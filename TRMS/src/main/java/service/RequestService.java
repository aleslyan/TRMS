package service;

import java.util.List;

import daos.RequestDAO;
import daos.RequestDAOim;
import models.Request;

public class RequestService {
	
	public static RequestDAO rd = new RequestDAOim();
	
	public static Request getRequest(int id) {
		
		return rd.getRequest(id);
	}
	
	public static List <Request> getAllRequests(){
		
		return rd.getAllRequests();
			
	}
	
	public static boolean addRequest(Request r) {
		
		return rd.addRequest(r);
	}
	
	public static boolean updateRequest(Request change) {
		
		return rd.updateRequest(change);
	}

	public static boolean deleteRequest(int id) {
		
		return rd.deleteRequest(id);
	}
}
