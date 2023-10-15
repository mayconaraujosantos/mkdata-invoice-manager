package com.mkdata.invoicesmanager;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InvoicesmanagerApplicationTests {

	@Test
	void contextLoads() {
		String[] args = { "" };
		Runnable runnable = () -> InvoicesmanagerApplication.main(args);
		assertNotNull(runnable);
	}

}
