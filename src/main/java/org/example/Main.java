package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Batalla pokemoncia
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int vida1 = 200, vida2 = 200;
        boolean turnoJugador1 = true;

        while (vida1 > 0 && vida2 > 0) {
            System.out.println("\nTurno del " + (turnoJugador1 ? "Jugador 1" : "Jugador 2"));

            System.out.println("Seleccione el tipo del Pokémon atacante: 1. Agua, 2. Fuego, 3. Planta, 4. Eléctrico");
            int tipoAtacante = sc.nextInt();

            System.out.println("Seleccione el tipo del Pokémon defensor: 1. Agua, 2. Fuego, 3. Planta, 4. Eléctrico");
            int tipoDefensor = sc.nextInt();

            int ataque = rand.nextInt(100) + 1;
            int defensa = rand.nextInt(100) + 1;

            System.out.println("Ataque generado: " + ataque);
            System.out.println("Defensa generada: " + defensa);

            double efectividad = 1.0;

            if ((tipoAtacante == 1 && tipoDefensor == 2) ||
                    (tipoAtacante == 2 && tipoDefensor == 3) ||
                    (tipoAtacante == 3 && tipoDefensor == 1) ||
                    (tipoAtacante == 4 && tipoDefensor == 1)) {
                efectividad = 2.0;
            } else if ((tipoAtacante == 2 && tipoDefensor == 1) ||
                    (tipoAtacante == 3 && tipoDefensor == 2) ||
                    (tipoAtacante == 1 && tipoDefensor == 3) ||
                    (tipoAtacante == 1 && tipoDefensor == 4)) {
                efectividad = 0.5;
            }

            double dano = 50 * ((double) ataque / defensa) * efectividad;

            if (turnoJugador1) {
                vida2 -= dano;
                System.out.println("Jugador 2 recibe " + dano + " de daño. Vida restante: " + Math.max(0, vida2));
            } else {
                vida1 -= dano;
                System.out.println("Jugador 1 recibe " + dano + " de daño. Vida restante: " + Math.max(0, vida1));
            }

            turnoJugador1 = !turnoJugador1;
        }

        System.out.println("\n¡Juego terminado!");
        if (vida1 <= 0) {
            System.out.println("Jugador 2 gana la batalla!");
        } else {
            System.out.println("Jugador 1 gana la batalla!");
        }

    }
}