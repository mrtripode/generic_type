package es.mikostrategy.generic;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = GenericApplication.class)
class GenericApplicationTests {

	@Autowired
	private GenericApplication genericApplication;

	@Test
	void applicationContextLoads() {
		assertNotNull(genericApplication);
	}

}
