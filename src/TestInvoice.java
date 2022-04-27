import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestInvoice {
	static Invoice invoice;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		invoice = new Invoice(5);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testIvaredu() {
		invoice.reducedIva();
		assertEquals(5 + 5 * 0.21d, invoice.total);
	}

	@Test
	void testIva() {
		invoice.iva();
		assertEquals(5 + 5 * 0.04d, invoice.total);
	}

	@Test
	void testDescuentoesp() {
		invoice.specialDiscount();
		assertEquals(5 - 5 * 0.10d, invoice.total);
	}

}
