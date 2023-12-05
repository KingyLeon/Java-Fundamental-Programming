/**
 * 
 */
package Question_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TenantTest {

	@Test
	public void testInvalidTenant() {
		try {
			Tenant tenant1 = new Tenant("", "King", 19, TenantType.STUDENT);
			fail("Expected IllegalArgumentException not thrown");
		} catch (IllegalArgumentException e) {

		}
	}

	@Test
	public void testInvalidTenant2() {
		try {
			Tenant tenant1 = new Tenant("Leon", "King", 12, TenantType.STUDENT);
			fail("Expected IllegalArgumentException not thrown");
		} catch (IllegalArgumentException e) {

		}
	}

	@Test
	public void testNullTenant() {
		try {
			Tenant tenant1 = new Tenant(null, "King", 19, TenantType.STUDENT);
			fail("Expected NullPointerException not thrown");
		} catch (NullPointerException e) {

		}
	}

	@Test
	public void testgetAge() {
		Tenant tenant1 = new Tenant("Leon", "King", 19, TenantType.STUDENT);
		assertEquals(19, tenant1.getAge());
	}

	@Test
	public void testgetName() {
		Tenant tenant1 = new Tenant("Leon", "King", 19, TenantType.STUDENT);
		assertEquals("Leon King", tenant1.getName());
	}

	@Test
	public void testgetType() {
		Tenant tenant1 = new Tenant("Leon", "King", 19, TenantType.STUDENT);
		assertEquals(TenantType.STUDENT, tenant1.getType());
	}

}
