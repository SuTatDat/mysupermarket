package com.mysupermarket;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import com.mysupermarket.service.MyService;

@SpringBootTest ("service.message=hello")
class SharedApplicationTests {

	@Autowired
	private MyService myService;

	@Test
	public void contextLoads() {
	  assertThat(myService.message()).isNotNull();
	}
  
	@SpringBootApplication
	static class TestConfiguration {
	}
  
}
