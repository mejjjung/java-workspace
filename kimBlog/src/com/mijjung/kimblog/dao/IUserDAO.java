package com.mijjung.kimblog.dao;

import com.mijjung.kimblog.dto.UserDTO;

public interface IUserDAO {

	int saveUser(UserDTO user);

	UserDTO selectUserByUsernameAndPassword(String username, String password);

}
