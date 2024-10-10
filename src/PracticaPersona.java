import java.util.Scanner;
class Persona {
    String nombre;
    int edad;
    String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}

public class PracticaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25, "Masculino");
        Persona persona2 = new Persona("María", 30, "Femenino");

        persona1.presentarse();
        persona2.presentarse();
    }
}