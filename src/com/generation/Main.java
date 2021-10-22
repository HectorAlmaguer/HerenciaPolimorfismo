package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;

public class Main {

    public static void main(String[] args) {
	 Ave ave = new Ave("Piolin");
		System.out.println(ave.getNombre());
	 //ave.comunicarse();
	 //ave.comer();

		System.out.println("-----------------------");
	 Perro lomito = new Perro("Coraje");
	 //lomito.jugar();
	 //lomito.comer("Croquetas");
    }
}
