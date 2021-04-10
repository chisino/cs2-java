// Name: Artiom Dolghi

import java.util.Random;

public class LightsOut {
	// Attributes
	private int m;
	private int n;
	private boolean[][] lightsArray;
	
	// Constructor
	public LightsOut(int m, int n) {
		
		if (m <= 3 || n <= 3) {
			throw new RuntimeException("m and n must > 3");
		}
		
		this.m = m;
		this.n = n;
		
		lightsArray = new boolean[m][n];
		
		reset();
	}
	
	// Getters
	public boolean getPatch(int x, int y) {
		
		if ( (x >= m || x < 0) || (y >= n || y < 0) ) {
			throw new RuntimeException("Invalid position");
		}
		
		return lightsArray[x][y];
	}
	
	// Setters
	public void setPatch(int x, int y, boolean newValue) {
		
		if ( (x >= m || x < 0) || (y >= n || y < 0) ) {
			throw new RuntimeException("Invalid position");
		}
		
		lightsArray[x][y] = newValue;
	}
	
	// Methods
	
	public void reset() {
		Random rand = new Random();
		boolean value = rand.nextBoolean();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				setPatch(i,j,value);
			}
		}
	}
	
	public boolean isDark() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++ ) {
				if (lightsArray[i][j] == false) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public boolean isWhite() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++ ) {
				if (lightsArray[i][j] == true) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	// Custom methods
	
	public void change(int x, int y) { // checks patch and sets
		if (getPatch(x,y) == true) {
			setPatch(x,y,false);
		}
		else {
			setPatch(x,y,true);
		}
	}
	
	public void togglePatch(int x, int y) {
		
		change(x,y); // changing specific block
		
		try {
			change(x-1,y); // up
		} catch (Exception e) {
			change(m-1,y);
		}
		
		try {
			change(x+1,y); // down
		} catch (Exception e) {
			change(0,y);
		}
		
		try {
			change(x,y-1); // left
		} catch (Exception e) {
			change(x,n-1);
		}
		
		try {
			change(x,y+1); // right
		} catch (Exception e) {
			change(x,0);
		}
		
	}
	
}
