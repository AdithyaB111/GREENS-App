package com.DAO;

import java.sql.Connection;

import com.entity.User;

public class UserDAOImpl implements UserDAO{

	private Connection conn;

	public UserDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	@Override
	public boolean userRegister(User us) {
		boolean f=false;
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return f;
	}
	
	
}
