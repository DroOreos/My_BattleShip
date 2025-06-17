package model;

public class Board {
	final static int row=10;
	final static int col=10;
	protected Cell grid[][];

	Board(){
		grid=new Cell[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j < col; j++) {
				grid[i][j] = new Cell(i,j);
				
			}
		}
		
	}
}
