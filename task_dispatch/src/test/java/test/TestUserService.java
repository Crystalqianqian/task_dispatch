package test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import entity.TaskDispathSys;
import service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml","classpath:spring-hibernate.xml" })
public class TestUserService {

	private static final Logger LOGGER = Logger.getLogger(TestUserService.class);

	@Autowired
	private UserService userService;

	@Test
	public void save() {
		
		TaskDispathSys taskDispathSys = new TaskDispathSys();
		taskDispathSys.setId(Integer.parseInt("1234581"));
		taskDispathSys.setHive("andy");
		taskDispathSys.setMysql("130229211");
		taskDispathSys.setDependency("depebdeb");
		taskDispathSys.setName("name");
		taskDispathSys.setPath("path");
		taskDispathSys.setPurpose("purpose");
		Integer id = userService.save(taskDispathSys);
		LOGGER.info(JSON.toJSONString(id));
	}
	
}
