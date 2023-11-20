package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitaDatos("Escrbe tu nombre: ");
        String apellidos = msg.solicitaDatos("Escrbe tu apellido: ");
        PersonaClase p1 = new PersonaClase(nombre, apellidos);
        msg.saludar(p1);
    }
}