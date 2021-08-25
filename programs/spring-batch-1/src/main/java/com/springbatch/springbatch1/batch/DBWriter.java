package com.springbatch.springbatch1.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springbatch.springbatch1.model.User;
import com.springbatch.springbatch1.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User> {

	@Autowired
	private UserRepository repository;



	@Override
	public void write(List<? extends User> users) throws Exception {
		System.out.println("Date saved for users :"+ users);
		repository.saveAll(users);
	}

}
