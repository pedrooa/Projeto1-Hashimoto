package br.pro.hashi.ensino.desagil.tequilada;

public class HumanPlayer extends Player {
	
	public HumanPlayer(int row, int col) {
		super(row,col);
	
	}
	public void move(int rowShift, int colShift){
		super.move(2*rowShift,2*colShift);
	}


}
