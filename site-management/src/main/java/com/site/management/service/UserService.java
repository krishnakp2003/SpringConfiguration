package com.site.management.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.site.management.repo.UserRepo;

public class UserService {

	@Value("${app.file-path}")
	private String filePath;
	
	
	
	@Autowired
	@Qualifier("userRepoMysqlImpl")
	private UserRepo userRepo;
	
	
	public UserService() {
		System.out.println("UserService: Object created");
	}
	public void filePath() {
		System.out.println("Save User On FilePath..." +filePath);
		long count = userRepo.save();
	}
	
	public void findAll() {
		List<Map<String, Object>> list=userRepo.findAll();
		for (Map<String, Object> map : list) {
			System.out.println(map);
			

		}
	}
}
