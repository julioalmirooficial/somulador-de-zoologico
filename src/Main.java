import animales.Animal;
import animales.Leon;

/*
Simulador de Zoológico:
Crea una clase "Animal" con atributos como especie, edad y nivel de hambre. Luego,
crea subclases para diferentes tipos de animales (por ejemplo, "León", "Jirafa", "Elefante")
con atributos y funciones específicas. Crea una clase "Zoológico" que tenga una lista de
animales y funciones para alimentar a los animales, limpiar sus recintos y agregar nuevos
animales al zoológico.*/
public class Main {
    public static void main(String[] args) {
       // LLAMANDO A TODOS LOS ANIMALES
//        Animal animal = new Animal();
//        animal.setEspecie("MAMIFEROS 12");
//        animal.setEdad(15);
//        animal.setNivelDeHambre(120);


        //LLAMANDO AL LEON
        Leon leon = new Leon();
        //ESTOS SON LOS DATOS QUE ESTA HEREDANDO EL LA CLASE ANIMAL
        leon.setEspecie("MAMIFEROS");
        leon.setEdad(15);
        leon.setNivelDeHambre(120);

        // ESTOS ATRIBUTOS SON PROPIOS DEL LEON
        leon.setElLeonCome(false);
        leon.setNombre("LEONCITO");
        leon.setNivelDeFuerza(350);


        System.out.println("Hola soy el león "+leon.getNombre() + "!");
        System.out.println("Soy del especie de los "+leon.getEspecie());
        System.out.println("tengo una fuerza de "+leon.getNivelDeFuerza());
        System.out.println("Yo puedo comer? "+(leon.getElLeonCome()?"SI":"NO"));
        System.out.println("Tengo  "+leon.getEdad() + " Años edad");
        System.out.println("Tengo un nivel de hambre "+leon.getNivelDeHambre() + " POR QUE ME GUSTA LA CARNE");
    }
}