package com.entelgy.challenge.modelos;

import com.entelgy.challenge.interfaces.InterfaceAnimal;

public class Vaca extends Animal{


    public Vaca(String nombre, int edad, String raza, int tiempoDeVida, String tipo) {
        super(nombre, edad, raza, tiempoDeVida, tipo);
    }

    @Override
    public String realizarSonido() {
        return "Mugir";
    }

    @Override
    public String describir() {
        return InterfaceAnimal.describirPolimorfirsmo(this);
    }
}
