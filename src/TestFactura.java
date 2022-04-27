import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestFactura {
	static fartura f;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		f = new fartura(5);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testIvaredu() {
		f.ivaredu();
		assertEquals(5 + 5 * 0.21d, f.tot);
	}

	@Test
	void testIva() {
		f.iva();
		assertEquals(5 + 5 * 0.04d, f.tot);
	}

	@Test
	void testDescuentoesp() {
		f.descuentoesp();
		assertEquals(5 - 5 * 0.10d, f.tot);
	}

}
