package Com.niit.dao;

import Com.niit.models.Job;

public interface JobDAO {
	public boolean saveOrUpdate(Job job);
	public boolean delete(Job job);

}