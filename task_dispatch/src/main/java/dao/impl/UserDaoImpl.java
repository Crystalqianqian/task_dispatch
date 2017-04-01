package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.UserDao;
import entity.TaskDispathSys;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	@Override
	public TaskDispathSys load(Integer id) {
		// TODO Auto-generated method stub
		return (TaskDispathSys) this.getCurrentSession().get(TaskDispathSys.class, id);
	}

	@Override
	public TaskDispathSys get(int id) {
		// TODO Auto-generated method stub
		return (TaskDispathSys) this.getCurrentSession().load(TaskDispathSys.class, id);
	}

	@Override
	public List<TaskDispathSys> findAll() {
		// TODO Auto-generated method stub
		List<TaskDispathSys> TaskDispathSys = this.getCurrentSession().createQuery("from task_dispatch_sys").setCacheable(true).list();
		return TaskDispathSys;
	}

	@Override
	public void persist(TaskDispathSys entity) {
		// TODO Auto-generated method stub

		this.getCurrentSession().persist(entity);
	}

	@Override
	public Integer save(TaskDispathSys entity) {
		// TODO Auto-generated method stub
		return  (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(TaskDispathSys entity) {
		// TODO Auto-generated method stub

		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

		TaskDispathSys entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

		this.getCurrentSession().flush();
	}

}
