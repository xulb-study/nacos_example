
package com.alibaba.nacos.example.spring.cloud;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.nacos.example.spring.cloud.dao.UserRepository;
import com.alibaba.nacos.example.spring.cloud.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	@Autowired
	
	private UserRepository userRepository;


	@Test
	@Transactional
	public void batchInsert1()  {
		
		
		for (long i = 0; i < 5; i++) {
			User user=new User();
			user.setId(i);
			user.setName("xx");
			userRepository.save(user);
		}
		
		
	}
	
	@Test
	@Transactional
	public void batchInsert2()  {
		
		
		for (long i = 5; i < 500; i++) {
			User user=new User();
			user.setId(i);
			user.setName("xx");
			userRepository.save(user);
		}
		
		
	}


}
