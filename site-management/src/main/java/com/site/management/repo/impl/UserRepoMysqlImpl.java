package com.site.management.repo.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import com.site.management.repo.UserRepo;

public class UserRepoMysqlImpl implements UserRepo{
	private final String Q_FIND_ALL="select * from user";
	@Autowired
	@Qualifier("jdbcTemplateAPP")
private JdbcTemplate jdbcTemplate;

	
	public UserRepoMysqlImpl() {
		System.out.println("UserRepoMysqlImpl: Object created.....");
		// TODO Auto-generated constructor stub
	}

	@Override
	public long save() {
		System.out.println("UserRepoMysqlImpl: saving user.....");
		return 0;
	}

	@Override
	public List<Map<String, Object>> findAll() {
		return jdbcTemplate.queryForList(Q_FIND_ALL);
		
	}
	
}
