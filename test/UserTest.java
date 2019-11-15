/**
 * 
 */
package practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author dmartinezc4
 *
 */
class UserTest {
	
	User a= new User(475896589,"David","Martinez");
	/**
	 * Test method for {@link practica.User#User(int, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testUser() {
		assertEquals(a.getDni(),475896589);
		assertEquals(a.getName(),"David");
		assertEquals(a.getSurname(),"Martinez");
	}

}
