package springboot.springboot;

import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.springframework.test.context.ActiveProfiles;


import org.junit.jupiter.api.Test;


@SpringBootTest
@ActiveProfiles("test")
class SpringbootApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}
}
