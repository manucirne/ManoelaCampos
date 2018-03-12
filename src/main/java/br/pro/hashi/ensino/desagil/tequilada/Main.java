package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;
import java.util.LinkedList;


public class Main {
	private static final String FILENAME = "D:/DCA/ManoelaCampos/labirinto.txt";

	public static void main(String[] args){
		System.out.println("Projeto 1");
		
		
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;
			String labirinto = "";
			String hw = br.readLine();
			int h = Integer.parseInt(hw.substring(0, 1));
			int w = Integer.parseInt(hw.substring(2, 4));
			//System.out.println(h);
			Character[] linha = new Character[w];
			Character[] lab = new Character[h];
			
	
			while ((sCurrentLine = br.readLine()) != null) {
				labirinto = "";
				//System.out.println(sCurrentLine);
				//sCurrentLine = sCurrentLine.replaceAll("#", "X");
				for(int i = 0; i < w; i++){
					
					if (sCurrentLine.charAt(i) == '#'){
						labirinto += 'X';
						//System.out.println('X');
						
					}
					else{
						labirinto += ' ';
						//System.out.println(' ');
					}
				}
				System.out.println(labirinto);
				
			
			
				
			}
			System.out.println(lab);
			
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
		

