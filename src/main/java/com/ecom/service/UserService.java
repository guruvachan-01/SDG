package com.ecom.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ecom.model.UserDtls;

public interface UserService {

	public UserDtls saveUser(UserDtls user);
	public List<UserDtls> getAllUsers(String role);
	public UserDtls saveAdmin(UserDtls user);
	public UserDtls getUserByEmail(String email);
		
	
	public UserDtls updateUserProfile(UserDtls user,MultipartFile img);
	

}
