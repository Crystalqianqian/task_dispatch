package controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.TaskDispathSys;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger LOGGER = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable Integer userId){
		
		LOGGER.info("查询用户:" + userId);
		TaskDispathSys taskDispathSys = userService.load(userId);
		modelMap.addAttribute("userInfo", taskDispathSys);
		return "/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody List<TaskDispathSys> showUserInfos(){
		LOGGER.info("查询用户全部用户");
		logger.info("test git");
		List<TaskDispathSys> userInfos = userService.findAll();
		return userInfos;
	}
}
