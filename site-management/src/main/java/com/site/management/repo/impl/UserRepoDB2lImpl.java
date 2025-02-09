package com.site.management.repo.impl;

import java.util.List;
import java.util.Map;

import com.site.management.repo.UserRepo;

public class UserRepoDB2lImpl implements UserRepo {

	@Override
	public List<Map<String, Object>> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long save() {
		System.out.println("UserRepoDB2lImpl: saving user...");
		return 0;
	}

}
