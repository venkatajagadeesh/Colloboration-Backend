package Com.niit.dao;

import Com.niit.models.Event;

public interface EventDAO {

	public boolean saveOrUpdate(Event event);
	public boolean delete(Event event);
}