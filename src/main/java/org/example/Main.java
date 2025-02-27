package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<String> productos = new ArrayList<>();
        productos.add("1. Panela");
        productos.add("2. Arroz");
        productos.add("3. Chocolate");
        productos.add("4. Papas");
        productos.add("5. Cafe");

        List<Double> precios = new ArrayList<>();
        precios.add(2500.0);
        precios.add(2000.0);
        precios.add(1600.0);
        precios.add(3000.0);
        precios.add(5000.0);

        int maxProductos = 5;

        System.out.println("Bienvenido a la Maquinita\n");
        System.out.println("Lista de productos:");

        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i) + " -> $" + precios.get(i));
        }

        System.out.print("Ingrese la cantidad de dinero que tiene: ");
        double dineroDis = teclado.nextDouble();
        double totalCompra = 0;

        for (int i = 0; i < maxProductos; i++) {
            System.out.print("Seleccione un producto (1-5) o 0 para salir: ");
            int opcion = teclado.nextInt();

            if (opcion == 0) {
                break;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Esta opcion no esta, intente de nuevo.");
                i--;
                continue;
            }

            double precioProducto = precios.get(opcion - 1);

            if (totalCompra + precioProducto > dineroDis) {
                System.out.println("Falta plata. No puede comprar este producto.");
                continue;
            }

            totalCompra += precioProducto;
            System.out.println("Agregado: " + productos.get(opcion - 1) + " --> $" + precioProducto);
        }

        double cambio = dineroDis - totalCompra;
        System.out.println("Total a pagar: $" + totalCompra);
        System.out.println("Cambio: $" + cambio);
        System.out.println("Gracias por su compra señor");
    }
}