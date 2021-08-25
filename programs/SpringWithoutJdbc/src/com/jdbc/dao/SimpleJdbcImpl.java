package com.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;


import com.jdbc.model.Circle;

public class SimpleJdbcImpl extends SimpleJdbcDaoSupport{

	public int getCirclesCount() {
		String sql= "SELECT COUNT(*) FROM CIRCLE";
		return this.getJdbcTemplate().queryForInt(sql);
	}
}
