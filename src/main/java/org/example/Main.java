package org.example;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*int saldo= 50000;
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

        }while(opcion!=5);*/

        int opcion=0;
        double valor = 0.0;
        double calculo = 0.0;

        System.out.println("Conversiones de grados");

        System.out.println("1. Fahrenheit a Celsius");
        System.out.println("2. Celsius a Fahrenheit");
        System.out.println("3. Kelvin a Celsius");
        System.out.println("4. Celsius a Kelvin");
        System.out.println("5. Kelvin a Fahrenheit");
        System.out.println("6. Fahrenheit a Kelvin");
        System.out.println("7. Reaumur a Celsius");
        System.out.println("8. Celsius a Reaumur");
        System.out.println("9. Fahrenheit a Reaumur");
        System.out.println("10. Reaumur a Fahrenheit");

        System.out.println("\nIngrese la opcion que desea: ");
        Scanner s = new Scanner(System.in);
        opcion = s.nextInt();

        switch (opcion){
            case 1 ->{
                System.out.println("1. Fahrenheit a Celsius\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = (5*(valor-32))/9;
                System.out.println(valor+ " grados Fahrenheit a Celsius son : " + calculo);
            }
            case 2 ->{
                System.out.println("2. Celsius a Fahrenheit\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = ((9*valor)/5)+32;
                System.out.println(valor+ " grados Celsius a Fahrenheit son : " + calculo);
            }
            case 3 ->{
                System.out.println("3. Kelvin a Celsius\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = valor - 273.15;
                System.out.println(valor+ " grados Kelvin a Celsius son : " + calculo);
            }
            case 4 ->{
                System.out.println("4. Celsius a Kelvin\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = valor + 273.15;
                System.out.println(valor+ " grados Celsius a Kelvin son : " + calculo);
            }
            case 5 ->{
                System.out.println("5. Kelvin a Fahrenheit\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = ((9*(valor-273.15))/5)+32;
                System.out.println(valor+ " grados Kelvin a Fahrenheit son : " + calculo);
            }
            case 6 ->{
                System.out.println("6. Fahrenheit a Kelvin\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = ((5*(valor-32))/9)+273.15;
                System.out.println(valor+ " grados Fahrenheit a Kelvin son : " + calculo);
            }
            case 7 ->{
                System.out.println("7. Reaumur a Celsius\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = (5*valor)/4;
                System.out.println(valor+ " grados Reaumur a Celsius son : " + calculo);
            }
            case 8 ->{
                System.out.println("8. Celsius a Reaumur\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = (4*valor)/5;
                System.out.println(valor+ " grados Celsius a Reaumur son : " + calculo);
            }
            case 9 ->{
                System.out.println("9. Fahrenheit a Reaumur\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = (4*(valor-32))/9;
                System.out.println(valor+ " grados Fahrenheit a Reaumur son : " + calculo);
            }
            case 10 ->{
                System.out.println("10. Reaumur a Fahrenheit\n");
                System.out.println("Ingrese valor: ");
                valor = s.nextDouble();
                calculo = ((9*valor)/4)+32;
                System.out.println(valor+ " grados Reaumur a Fahrenheit son : " + calculo);
            }

        }

    }
}