package org.example;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int saldo= 50000;
        int opcion=0;

        System.out.println("CAJERO AUTOMATICO\n");

        do{

            System.out.println("1 Consulta de saldo");
            System.out.println("2 Ingresar dinero");
            System.out.println("3 Retirar dinero");
            System.out.println("4 Salir");

            System.out.println("\nIngrese la opcion que desea: ");
            Scanner s = new Scanner(System.in);
            opcion = s.nextInt();

            switch(opcion){
                case 1 -> System.out.println("Su saldo es:"+saldo);
                case 2 -> {
                    System.out.println("¿Cuanto dinero desea ingresar? valor: ");
                    saldo = saldo + s.nextInt();
                }
                case 3 -> {
                    System.out.println("¿Cuanto dinero desea retirar? valor: ");
                    saldo = saldo - s.nextInt();
                }
                case 4 -> System.out.println("Cerrado");
            }

        }while(opcion!=5);
    }
}