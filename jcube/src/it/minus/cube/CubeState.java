package it.minus.cube;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class CubeState {
	private char[][][] faces;
	public static final char[] COLORS={'R','G','B','W','Y','O'};
	public static final String[] COLORS_NAMES={"red","green","blue","white","yellow","orange"};
	public static final Set<Character> ALLOWED_COLORS;
	
	static{
		ALLOWED_COLORS = new TreeSet<Character>();
		for (Character c : COLORS) {
			ALLOWED_COLORS.add(c);
			ALLOWED_COLORS.add(Character.toUpperCase(c));
		}
	}
	
	public CubeState() {
		faces = new char[6][2][2];
		for(int i = 0;i<6;i++){
			for(int x=0;x<2;x++){
				for(int y=0;y<2;y++){
					faces[i][x][y]=COLORS[i];
				}
			}
		}
	}
	
	public CubeState(CubeState source) {
		faces = new char[6][2][2];
		for(int i = 0;i<6;i++){
			for(int x=0;x<2;x++){
				for(int y=0;y<2;y++){
					faces[i][x][y]=source.faces[i][x][y];
				}
			}
		}
	}

	public CubeState(String serializedForm) {
		faces = new char[6][2][2];
		char[] charArray = serializedForm.toCharArray();
		int i=0;
		for (char c : charArray) {
			if(ALLOWED_COLORS.contains(c)){
				int v = i;
				int f = v / 4;
				v = v % 4;
				int x = v / 2;
				int y = v % 2;
				faces[f][x][y]=charArray[i++];
			}
		}
	}

	public CubeState(char[] arrayForm) {
		faces = new char[6][2][2];
		int i =0;
		for(int f = 0;f<6;f++){
			for(int x=0;x<2;x++){
				for(int y=0;y<2;y++){
					faces[f][x][y]=arrayForm[i++];
				}
			}
		}
	}
	
	public char[] toCharArray(){
		char [] buffer= new char[24];
		int i =0;
		for(int f = 0;f<6;f++){
			for(int x=0;x<2;x++){
				for(int y=0;y<2;y++){
					buffer[i++]=faces[f][x][y];
				}
			}
		}
		return buffer;
	}
	
	public char[][] getFace(int face){
		char[][]newFace=new char[2][2];
		for(int x=0;x<2;x++){
			for(int y=0;y<2;y++){
				newFace[x][y]=faces[face][x][y];
			}
		}
		return newFace;
	}

	
	
	
	@Override
	public String toString() {
		return new String(toCharArray());
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CubeState other = (CubeState) obj;
		if (toString() == null) {
			if (other.toString() != null)
				return false;
		} else if (!toString().equals(other.toString()))
			return false;
		return true;
	}
	
	
}
