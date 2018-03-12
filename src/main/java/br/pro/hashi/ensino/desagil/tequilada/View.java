package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.Dimension;

import javax.swing.JPanel;

// Estrutura básica de um componente Swing.
public class View extends JPanel {
	// Estrutura básica de um componente Swing.
	private static final long serialVersionUID = 1L;


	// Constante que define o tamanho de cada célula do tabuleiro.
	private static final int CELL_SIZE = 50;


	public View(Model model) {
		Board board = model.getBoard();

		int numRows = board.getNumRows();
		int numCols = board.getNumCols();

		// Define o tamanho da componente, em pixels.
		setPreferredSize(new Dimension(numCols * CELL_SIZE, numRows * CELL_SIZE));
	}
}
