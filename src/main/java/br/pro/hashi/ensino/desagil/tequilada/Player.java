package br.pro.hashi.ensino.desagil.tequilada;

public abstract class Player extends Element {
	protected int score;
	
	protected Player(int row, int col) {
		super(row, col);
		score = 0;
	}

	public void move(int rowShift, int colShift) {
		row += rowShift;
		col += colShift;
	}
	
	public void pontua(){
		score++;
	}
	public int getScore(){
		return score;
	}
}
