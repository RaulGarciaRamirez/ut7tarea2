import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestFactura {
	static Invoice f;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		f = new Invoice(5);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testIvaredu() {
		f.reducedIva();
		assertEquals(5 + 5 * 0.21d, f.total);
	}

	@Test
	void testIva() {
		f.iva();
		assertEquals(5 + 5 * 0.04d, f.total);
	}

	@Test
	void testDescuentoesp() {
		f.specialDiscount();
		assertEquals(5 - 5 * 0.10d, f.total);
	}

}
