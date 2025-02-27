package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int puntos1 = 0;
        int puntos2 = 0;
        int rondas = 0;
        do {
            int nRandom1 = aleatorio.nextInt(1, 3);
            int nRandom2 = aleatorio.nextInt(1, 3);
            if (nRandom1 == 1 && nRandom2 == 1 ) {
                System.out.println("Jugador      1           2");
                System.out.println("             Piedra      Piedra");
                System.out.println("Empate\n");
            } else if (nRandom1 == 1 && nRandom2 == 2) {
                System.out.println("Jugador      1           2");
                System.out.println("             Piedra      Papel");
                System.out.println("Punto para el jugador 2\n");
                puntos2 += 1;
            } else if (nRandom1 == 1 && nRandom2 == 3) {
                System.out.println("Jugador      1           2");
                System.out.println("             Piedra      Tijera");
                System.out.println("Punto para el jugador 1\n");
                puntos1 += 1;
            } else if (nRandom1 == 2 && nRandom2 == 1) {
                System.out.println("Jugador      1           2");
                System.out.println("             Papel       Piedra");
                System.out.println("Punto para el jugador 1\n");
                puntos1 += 1;
            }else if (nRandom1 == 2 && nRandom2 == 2 ) {
                System.out.println("Jugador      1           2");
                System.out.println("             Papel       Papel");
                System.out.println("Empate\n");
            } else if (nRandom1 == 2 && nRandom2 == 3) {
                System.out.println("Jugador      1           2");
                System.out.println("             Papel       Tijera");
                System.out.println("Punto para el jugador 2\n");
                puntos2 += 1;
            } else if (nRandom1 == 3 && nRandom2 == 1) {
                System.out.println("Jugador      1           2");
                System.out.println("             Tijera      Piedra");
                System.out.println("Punto para el jugador 2\n");
                puntos2 += 1;
            } else if (nRandom1 == 3 && nRandom2 == 2) {
                System.out.println("Jugador      1           2");
                System.out.println("             Tijera       Papel");
                System.out.println("Punto para el jugador 1\n");
                puntos1 += 1;
            }else if (nRandom1 == 3 && nRandom2 == 3 ) {
                System.out.println("Jugador      1           2");
                System.out.println("             Tijera      Tijera");
                System.out.println("Empate\n");
            }
            rondas+=1;
        }while(puntos1 < 2 || puntos2 < 2);
        System.out.printf("La cantidad de rondas fue: "+ rondas);
    }
}