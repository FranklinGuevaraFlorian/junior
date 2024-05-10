package com.entelgy.challenge.interfaces;

import com.entelgy.challenge.modelos.Animal;

public interface InterfaceAnimal {

    public   String realizarSonido();
    public   String describir();
    public static String describirPolimorfirsmo(Animal animal) {
        return  animal.getNombre() + "es un “tipo” de raza " + animal.getRaza() +
                " \n que tiene " +  animal.getEdad() + " Siempre " +animal.realizarSonido() +
                " \n cuando está feliz. Su expectativa de vida es de " + animal.getTiempoDeVida() + "años";
    }

}
