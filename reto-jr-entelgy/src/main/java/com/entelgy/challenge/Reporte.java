package com.entelgy.challenge;

import com.entelgy.challenge.modelos.Animal;
import com.entelgy.challenge.modelos.Gato;
import com.entelgy.challenge.modelos.Perro;
import com.entelgy.challenge.modelos.Vaca;

public class Reporte {

    public static void main(String[] args) {

        Animal[] animals = Reporte.cargarDatos();
        Reporte.buscarAnimal(animals[0]);

    }
    public static  Animal[] cargarDatos(){
        Animal perro1 = new Perro("Lazy", 21, "Chitzu", 20, "Perro");
        Animal perro2 = new Perro("Otto", 5, "Golden Retriever", 25, "Perro");
        Animal perro3 = new Perro("Rex", 3, "Labrador", 30, "Perro");

        Animal gato1 = new Gato("Botas", 1, "Junit", 15, "Gato");
        Animal gato2 = new Gato("Whiskers", 4, "Siamese", 12, "Gato");
        Animal gato3 = new Gato("Mittens", 2, "Persian", 10, "Gato");

        Animal vaca1 = new Vaca("Vaquita", 12, "Raza de vaca", 20, "Vaca");
        Animal vaca2 = new Vaca("Mimosa", 8, "Holstein", 18, "Vaca");
        Animal vaca3 = new Vaca("Manchita", 6, "Jersey", 22, "Vaca");

        Animal[] animales = {perro1, perro2, perro3, gato1, gato2, gato3, vaca1, vaca2, vaca3};
        return animales;
    }
    public static Object buscarAnimal(Animal animalABuscar){
        String nombreAnimal = animalABuscar.getNombre();
        Animal aux = null;

        for (Animal a : cargarDatos()) {
            if (a.getNombre().equals(nombreAnimal)) {
                aux = a;
                break;
            }
        }
        return aux != null ? aux.describir() :  new RuntimeException("Animal no encontrado");

    }
}
