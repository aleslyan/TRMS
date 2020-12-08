package service;

import java.util.List;

import daos.EventDAO;
import daos.EventDAOim;
import models.EventType;

public class EventTypeService {
	
	public static EventDAO ed = new EventDAOim();
	
	public static EventType getEvent(int id) {
		
		return ed.getEvent(id);
	}
	
	public static List <EventType> getAllEvents(){
		
		return ed.getAllEvents();
	}
	


}
