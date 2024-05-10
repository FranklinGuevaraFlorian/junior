package com.entelgy.challenge.modelos;

import com.entelgy.challenge.interfaces.InterfaceAnimal;

public class Perro extends Animal{

    public Perro(String nombre, int edad, String raza, int tiempoDeVida, String tipo) {
        super(nombre, edad, raza, tiempoDeVida, tipo);
    }

    @Override
    public String realizarSonido() {
        return "Ladrar";
    }

    @Override
    public String describir() {
        return InterfaceAnimal.describirPolimorfirsmo(this);
    }


}
