package br.pro.hashi.ensino.desagil.tequilada;

public class Target extends Element {
	public Target(int row, int col) {
		super(row, col);
	}
	public boolean drinked(Player human, Player cpu){
		if(human.getCol() == col && human.getRow() == row){
			human.pontua();
			return true;
		} else if (cpu.getCol() == col && cpu.getRow() == row){
			cpu.pontua();
			return true;
		} else{
			return false;
		}
	}
}
