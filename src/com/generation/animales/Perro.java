package com.generation.animales;

public class Perro extends Animal{
    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre){
        super(nombre);
    }
    public Perro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void respirar() {
        System.out.println("Respirando por la nariz");
    }

    public void jugar(){
        System.out.println("Estoy jugando");
    }
    public void ladrar(){
        System.out.println("Guauf");
    }

    public void comer(String alimento) {
        System.out.println("Estoy comiendo ");
    }
}
