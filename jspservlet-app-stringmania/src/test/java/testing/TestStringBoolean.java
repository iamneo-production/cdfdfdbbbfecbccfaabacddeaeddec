package testing;



import static org.junit.Assert.*;
import org.junit.Test;



public class TestStringBoolean {
	

	@Test
	public void testSetInputsMethod() {
		
	}

	@Test
	public void testContainsMethod() {
		
	}

	@Test
	public void testEndsWithMethod() {
		
	}

	@Test
	public void testStartsWithMethod() {
		
	}

	@Test
	public void testEqualsMethod() {
		
	}

	@Test
	public void testEqualsIgnoreCaseMethod() {
		assertEquals(true, sb.equalsIgnoreCase("java", "java"));
		assertEquals(false, sb.equalsIgnoreCase("java", " "));
		assertEquals(true, sb.equalsIgnoreCase("java", "Java"));
		try {
			sb.equals("", "");
			sb.equals("java", "");
			sb.equals("", "java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
	}
}
