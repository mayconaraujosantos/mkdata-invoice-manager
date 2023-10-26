package com.mkdata.invoicescollector;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class InvoicescollectorApplicationTests {

	@Test
	void contextLoads() {
		String[] args = {""};
		Runnable runnable = () -> InvoicescollectorApplication.main(args);
		assertNotNull(runnable);
	}

}
