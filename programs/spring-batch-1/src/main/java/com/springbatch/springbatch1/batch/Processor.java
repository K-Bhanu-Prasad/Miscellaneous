package com.springbatch.springbatch1.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.springbatch.springbatch1.model.User;

@Component
public class Processor implements ItemProcessor<User, User>{

	private static final Map<String,String> deptMap = new HashMap<>();

	public Processor() {
		deptMap.put("001", "Technology");
		deptMap.put("002", "Operation");
		deptMap.put("003", "Accounts");
		deptMap.put("004", "Technology");
		deptMap.put("005", "Technology");
	}

	@Override
	public User process(User user) throws Exception {

		user.setDept(deptMap.get(user.getDept()));
		System.out.println("converted from dept code to department");
		return user;
	}

}
