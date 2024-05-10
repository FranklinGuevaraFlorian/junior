package com.entelgy.challenge.modelos;

import com.entelgy.challenge.interfaces.InterfaceAnimal;

public abstract class Animal implements InterfaceAnimal {
    private String nombre;
    private int edad;
    private final String raza;
    private int tiempoDeVida;
    private final String tipo;

    public Animal(String nombre, int edad, String raza, int tiempoDeVida, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tiempoDeVida = tiempoDeVida;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(int tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }

    public String getTipo() {
        return tipo;
    }
}
