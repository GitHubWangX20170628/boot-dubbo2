package com.weein.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.weein.entity.User;
import com.weein.service.UserService;
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService{

	@Override
	public User getUser() {
		User user = new User();
		user.setCity("郑州");
		user.setUsername("by");
		user.setPassword("123456");
		return user;
	}

}
