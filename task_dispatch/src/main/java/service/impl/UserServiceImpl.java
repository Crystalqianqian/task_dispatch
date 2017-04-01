package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import entity.TaskDispathSys;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public TaskDispathSys load(Integer id) {
		// TODO Auto-generated method stub
		return userDao.load(id);
	}

	@Override
	public TaskDispathSys get(Integer id) {
		// TODO Auto-generated method stub
		return userDao.get(id);
	}

	@Override
	public List<TaskDispathSys> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public void persist(TaskDispathSys entity) {
		// TODO Auto-generated method stub

		userDao.persist(entity);
	}

	@Override
	public Integer save(TaskDispathSys entity) {
		// TODO Auto-generated method stub
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(TaskDispathSys entity) {
		// TODO Auto-generated method stub

		userDao.save(entity);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

		userDao.delete(id);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

		userDao.flush();
	}

}
