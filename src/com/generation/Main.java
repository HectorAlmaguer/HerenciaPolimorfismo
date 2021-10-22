package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.animales.UberBlackDrive;
import com.generation.animales.Uberdriver;

public class Main {

    public static void main(String[] args) {

    	/*
    	Ave ave = new Ave("Piolin");

		System.out.println(ave.getNombre());
	 	//ave.comunicarse();
	 	//ave.comer();

		System.out.println("-----------------------");
	 	Perro lomito = new Perro("Coraje");
	 	//lomito.jugar();
	 	//lomito.comer("Croquetas");
    	 */
		Uberdriver uberconductor = new Uberdriver("Hector","C250","SIRLW");
        UberBlackDrive uberblackconductor = new UberBlackDrive();
        System.out.println(uberconductor.getName());
        System.out.println(uberconductor.calculatePrice(6));
        System.out.println("-----------------------");
        System.out.println(uberblackconductor.calculatePrice(6));
    }
}
