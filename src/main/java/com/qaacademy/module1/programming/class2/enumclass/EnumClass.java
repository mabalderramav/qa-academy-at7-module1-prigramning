package com.qaacademy.module1.programming.class2.enumclass;

public class EnumClass {
    public static void main(String[] args) {
        String category = "FACIL";
        if (Levels.FACIL.toString().equals(category)) {
            System.out.println("El juego sera facil");
        } else if (Levels.MEDIO.toString().equals(category)){
            System.out.println("El juego sera medio");
        } else if (Levels.DIFICIL.toString().equals(category)) {
            System.out.println("El juego sera dificil");
        } else {
            System.out.println("No hay juego");
        }

        Levels category2 = Levels.FACIL;
        if (Levels.FACIL == category2) {
            System.out.println("El juego sera facil");
        } else if (Levels.MEDIO.equals(category2)){
            System.out.println("El juego sera medio");
        } else if (Levels.DIFICIL.equals(category2)) {
            System.out.println("El juego sera dificil");
        } else {
            System.out.println("No hay juego");
        }
    }
}
