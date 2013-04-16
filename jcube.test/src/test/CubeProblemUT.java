package test;

import static org.junit.Assert.*;
import it.minus.cube.CubeProblem;
import it.minus.cube.CubeState;

import org.junit.Test;

public class CubeProblemUT {

	@Test
	public void testCubeProblem() {
		CubeProblem cubeProblem = new CubeProblem(new CubeState());
		assertNotNull(cubeProblem);
	}

}
