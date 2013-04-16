package it.minus.cube;


public class CubeState {
	private char[][][] faces;
	private static final char[] COLOR={'R','G','B','W','Y','O'};
	private static final String[] COLORS_NAMES={"red","green","blue","white","yellow","orange"};
	
	
	public CubeState() {
		faces = new char[6][2][2];
		for(int i = 0;i<6;i++){
			for(int x=0;x<2;x++){
				for(int y=0;y<2;y++){
					faces[i][x][y]=COLOR[i];
				}
			}
		}
	}
}
