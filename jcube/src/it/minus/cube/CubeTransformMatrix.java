package it.minus.cube;

public class CubeTransformMatrix {
	public enum Rotation{
		CLOCKWISE,
		WIDDERSHINS
	}
	
	public CubeState rotate(CubeState state, int face, Rotation rotation ) {
		CubeState newState = new CubeState(state);
		char[][][] faceMatrix = newState.getFaceMatrix();
		// rotate face
		char[][] rotateFace = faceMatrix[face];
		char[][] originalFace = state.getFace(face);
		
		
		return null;
	}

}
