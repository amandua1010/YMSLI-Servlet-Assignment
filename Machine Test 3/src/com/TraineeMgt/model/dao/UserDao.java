package com.TraineeMgt.model.dao;

import com.TraineeMgt.web.entity.User;

public interface UserDao {
	
	public User getUser(String username,String password);
	
}
