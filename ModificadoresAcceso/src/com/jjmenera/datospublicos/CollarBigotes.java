package com.jjmenera.datospublicos;

import com.jjmenera.datosprivados.Bigotes;

public class CollarBigotes {
	
	public static void main(String[] args) {
		/*Bigotes.nombre = "Michu";
		Bigotes.edad = 10;
		Bigotes.colorPelo = "blanco";
		*/
		
		Bigotes Michu = new Bigotes ("Michu", 10, "blanco", 14, true, "Europea", true, "Nacimiento", 1, "Barra de Navidad", "5951011607", 70938, "Piscis", 4.3d);
		
		System.out.println(Michu.toString());
	}

	
}
