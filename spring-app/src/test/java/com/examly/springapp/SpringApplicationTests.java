package com.examly.springapp;

import static org.junit.Assert.*;
import org.junit.Test;

import utility.StringAdvanceMethod;
import utility.StringBoolean;
import utility.StringMethod;
public class TestStringAdvanceMethod {
	StringAdvanceMethod sam = new StringAdvanceMethod();

	@Test
	public void testSetInputsMethod() {
		sam.setInput1("Java");
		sam.setInput2("Program");
		assertEquals("Java", sam.getInput1());
		assertEquals("Program", sam.getInput2());
		try {
			sam.setInput1(null);
			sam.setInput2(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConcatMethod() {
		assertEquals("JavaProgram", sam.concat("Java", "Program"));
		assertEquals("Java@Program", sam.concat("Java@", "Program"));
		assertEquals("Java  Program", sam.concat("Java ", " Program"));
		try {
			sam.concat(null, null);
			sam.concat("Java", null);
			sam.concat(null, "Java");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSplitMethod() {
		assertEquals("Java  rogram", sam.split("Javaprogram", "p"));
		assertEquals("Ja  a@", sam.split("Java@", "v"));
		try {
			sam.split("Java", "");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testIndexOfMethod() {
		assertEquals("4", sam.indexOf("Javaprogram", "p"));
		assertEquals("1", sam.indexOf("Java@", "a"));
		assertEquals("4", sam.indexOf("Java ", " "));
		try {
			sam.indexOf("", "");
			sam.indexOf("Java", "");
			sam.indexOf("", "Java");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}

public class TestStringBoolean {
	StringBoolean sb = new StringBoolean();

	@Test
	public void testSetInputsMethod() {
		sb.setInput1("Java");
		sb.setInput2("Program");
		assertEquals("Java", sb.getInput1());
		assertEquals("Program", sb.getInput2());
		try {
			sb.setInput1(null);
			sb.setInput2(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testContainsMethod() {
		assertEquals(true, sb.contains("Java ", " "));
		assertEquals(false, sb.contains("Java", " "));
		assertEquals(true, sb.contains(" ", " "));
		try {
			sb.contains("", "");
			sb.contains("Java", "");
			sb.contains("", "Java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
	}

	@Test
	public void testEndsWithMethod() {
		assertEquals(true, sb.endsWith("java", "a"));
		assertEquals(false, sb.endsWith("java", " "));
		assertEquals(false, sb.endsWith("java", "j"));
		try {
			sb.endsWith("", "");
			sb.endsWith("java", "");
			sb.endsWith("", "java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
	}

	@Test
	public void testStartsWithMethod() {
		assertEquals(true, sb.startsWith("java", "j"));
		assertEquals(false, sb.startsWith("java", " "));
		assertEquals(false, sb.startsWith("java", "a"));
		try {
			sb.startsWith("", "");
			sb.startsWith("java", "");
			sb.startsWith("", "java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
	}

	@Test
	public void testEqualsMethod() {
		assertEquals(true, sb.equals("java", "java"));
		assertEquals(false, sb.equals("java", " "));
		assertEquals(false, sb.equals("java", "Java"));
		try {
			sb.equals("", "");
			sb.equals("java", "");
			sb.equals("", "java");
		} catch (IllegalArgumentException e) {
			// System.out.println("null");
			e.printStackTrace();
		}
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

public class TestStringMethod {
	StringMethod sm = new StringMethod();

	@Test
	public void testSetInputsMethod() {
		sm.setInput("Java");
		assertEquals("Java", sm.getInput());
		try {
			sm.setInput(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLowerMethod() {
		assertEquals("hai", sm.lower("HaI"));
		assertEquals("1234", sm.lower("1234"));
		assertEquals("hai&hello", sm.lower("hai&HELLO"));
		assertEquals("welcome", sm.lower("welcome"));
		try {
			sm.lower("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testUpperMethod() {
		assertEquals("HAI", sm.upper("HAI"));
		assertEquals("1234", sm.upper("1234"));
		assertEquals("HAI&HELLO", sm.upper("hai&HELLO"));
		assertEquals("WELCOME", sm.upper("welcome"));
		try {
			sm.upper("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testFirstCharacterMethod() {
		assertEquals("1", sm.firstCharacter("1.hai"));
		assertEquals("@", sm.firstCharacter("@hai"));
		assertEquals(" ", sm.firstCharacter(" hai"));
		assertEquals("h", sm.firstCharacter("hai"));
		try {
			sm.firstCharacter(" ");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testLengthMethod() {
		assertEquals("0", sm.length(""));
		assertEquals("15", sm.length(" WelcomeToJava "));
		assertEquals("4", sm.length("123 "));
		assertEquals("1", sm.length("."));
		try {
			sm.length("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testTrimMethod() {
		assertEquals("Java", sm.trim(" Java "));
		assertEquals("Ja va", sm.trim("Ja va "));
		assertEquals("Java", sm.trim("  Java  "));
		try {
			sm.trim("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}
}
