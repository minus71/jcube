package it.minus.cube;

import it.minus.cube.CubeTransformMatrix.Rotation;

public class CubeProblem {
	private CubeState state;
	private CubeTransformMatrix xformer = new CubeTransformMatrix();
	public enum Action{
		ROTATE_TOP,
		ROTATE_LEFT,
		ROTATE_CENTER
	}
	
	public CubeProblem(CubeState state) {
		super();
		this.state = state;
	}
	
	public Action[] getActions(){
		return Action.values();
	}
	
	public CubeState getSuccessorState(CubeState state, Action action){
		CubeState result=state;
		if(action==Action.ROTATE_TOP){
			result = xformer.rotate(state,Action.ROTATE_TOP.ordinal(), Rotation.CLOCKWISE);
		}
		return result;
	}
	
}
