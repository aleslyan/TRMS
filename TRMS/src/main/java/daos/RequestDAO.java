package daos;

import java.util.List;

import models.Request;

public interface RequestDAO {
	
	public Request getRequest(int id);
	public List <Request> getAllRequests();
	public boolean addRequest(Request r);
	public boolean updateRequest(Request change);
	public boolean deleteRequest(int id);

}
