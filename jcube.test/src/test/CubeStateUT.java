package test;

import static org.junit.Assert.*;
import it.minus.cube.CubeState;

import org.junit.Test;

public class CubeStateUT {

	@Test
	public void testCubeState() {
		CubeState cs = new CubeState();
		assertNotNull("Create a no arg cube state",cs);
	}

	@Test
	public void testEquality(){
		CubeState c1 = new CubeState();
		CubeState c2 = new CubeState();
		assertEquals(c1, c2);
		assertFalse(c1.equals(null));
		assertFalse(c1.equals("RRRRGGGGBBBBWWWWYYYYOOOO"));
		assertEquals(c1, c1);
	}

	@Test
	public void testToString(){
		CubeState c1 = new CubeState();
		assertEquals("RRRRGGGGBBBBWWWWYYYYOOOO", c1.toString());
	}
	
	@Test
	public void testConstructFromString() {
		CubeState c1 = new CubeState();
		CubeState c2 = new CubeState("RRRRGGGGBBBBWWWWYYYYOOOO");
		assertEquals(c1,c2);
	}
	
}
