package payroll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PayrollApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

	@Test
	void testEmployee() {
		Employee employee = new Employee("João", "Estagiário");
		assertEquals("João", employee.getName());
		assertEquals("Estagiário", employee.getRole());
	}
}
