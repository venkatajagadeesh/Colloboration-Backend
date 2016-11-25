package Com.niit.dao;

import Com.niit.models.Forum;

public interface ForumDAO {
	public boolean saveOrUpdate(Forum forum);
	public boolean delete(Forum forum);

}