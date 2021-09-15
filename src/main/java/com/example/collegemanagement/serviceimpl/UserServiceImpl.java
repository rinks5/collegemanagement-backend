package com.example.collegemanagement.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegemanagement.model.Users;
import com.example.collegemanagement.repository.UserRepository;
import com.example.collegemanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public Boolean saveUser(Users user) {
		Optional<Users> newUser = Optional.of(userRepo.save(user));
		if(newUser.isPresent())
			return true;
		else
			return false;
	}

	@Override
	public Users findUser(String email, String password) {
		Optional<Users> user = userRepo.findByEmailAndPassword(email, password);
		
		if(user.isPresent())
			return user.get();
		else
		return null;
	}
	
	

}
