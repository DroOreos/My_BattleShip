package model;

public class Cell {
	
	private final int r,c;//location
	protected currState state = currState.WATER;
	public enum currState{
		WATER,
		SHIP,
		HIT,
		MISS;

	}
	
	Cell(int r, int c){
		this.r=r;
		this.c=c;
		
	}
	
	currState getState(){
		return this.state;
	}
	
	void setState(currState st){
		state = st;
	}
	
}
