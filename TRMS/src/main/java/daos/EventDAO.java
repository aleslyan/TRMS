package daos;

import java.util.List;

import models.EventType;

public interface EventDAO {

	public EventType getEvent(int id);
	public List <EventType> getAllEvents();
	
	
}
