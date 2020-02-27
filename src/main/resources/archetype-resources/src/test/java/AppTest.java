package ${groupId};

import org.junit.jupiter.api.*;

public class AppTest {
	@BeforeEach
	public void setup() {
		// before each test method
	}

	@Test
	public void testApp() {
		// this is an empty test
		Assertions.assertTrue(1 == 1, "Expected value should be true");
	}
}

