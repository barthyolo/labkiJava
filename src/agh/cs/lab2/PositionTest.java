package agh.cs.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {

	@Test					//adnotacja mowiaca ze to test
	public void test() {
		assertEquals("(1,2)", new Position(1,2).toString());
	}

	@Test
	public void positionSmaller() {
		assertTrue(new Position(1,2).smaller(new Position (3,4)));
		assertTrue(new Position(3,4).smaller(new Position (1,2)));
	}
}
