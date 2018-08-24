package com.weein.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.weein.entity.User;
import com.weein.service.UserService;

@RestController
public class UserController {
	@Reference(version = "1.0.0")
	private UserService userService;

	@RequestMapping(value = "getUser")
	public User getUser() {
		return userService.getUser();
	}
}
