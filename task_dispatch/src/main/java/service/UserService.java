package service;

import java.util.List;

import entity.TaskDispathSys;

public interface UserService {

	TaskDispathSys load(Integer id);

	TaskDispathSys get(Integer id);

	List<TaskDispathSys> findAll();

	void persist(TaskDispathSys entity);

	Integer save(TaskDispathSys entity);

	void saveOrUpdate(TaskDispathSys entity);

	void delete(Integer id);

	void flush();
}
