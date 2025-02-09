package com.site.management.repo;

import java.util.List;
import java.util.Map;

public interface UserRepo {

	public long save();
	
	public List<Map<String, Object>> findAll();
}
