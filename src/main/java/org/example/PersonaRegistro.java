package org.example;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString(){
        System.out.println("Tests, intruccion insevible");
        return "%s %s".formatted(nombre, apellidos);
    }
}
