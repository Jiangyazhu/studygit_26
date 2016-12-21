package com.yc.ccs.web.handler;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.ccs.entity.Admin;
import com.yc.ccs.service.AdminService;

@Controller
@RequestMapping("/admin")
public class UserHandler {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/login")
	@ResponseBody
	public void login(Admin admin,HttpSession session){
		LogManager.getLogger().debug("请求UserHandler处理login...");
		if(adminService.login(admin)){
			session.setAttribute("errorMsg", "用户名或密码错误");
			return ;
		}
	}
}
