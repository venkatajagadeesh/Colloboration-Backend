package Com.niit.dao;

import java.util.List;

import Com.niit.models.Users;

public interface UsersDAO {

	public boolean saveOrUpdate(Users users);
	public boolean delete(Users users);
	public List<Users>list();
}