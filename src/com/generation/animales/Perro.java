package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamiferos{
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

    @Override
    public void dormir() {
        System.out.println("zzzzzzz");
    }

    @Override
    public void hablar() {
        System.out.println("Guauff");
    }

    @Override
    public void gestación() {
        System.out.println("Tiempo de dos meses");
    }

    @Override
    public void ingestarLeche() {
        System.out.println("Estoy tomando Leche");
    }

    @Override
    public void movilidad() {
        System.out.println("Camino en 4 patas");
    }
}
