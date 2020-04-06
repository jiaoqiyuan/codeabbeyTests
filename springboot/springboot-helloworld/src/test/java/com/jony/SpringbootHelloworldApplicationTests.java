package com.jony;

import com.jony.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootHelloworldApplicationTests {

	@Autowired
	private Person person;
	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
