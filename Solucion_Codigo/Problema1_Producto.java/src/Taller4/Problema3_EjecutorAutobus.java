/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Problema3_EjecutorAutobus {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantos estudiantes desea registrar? ");
        int cantEstudiantes = entrada.nextInt();
        entrada.nextLine();

        Problema3_Autobus[] estudiantes = new Problema3_Autobus[cantEstudiantes];

        for (int i = 0; i < cantEstudiantes; i++) {
            System.out.println("\nEstudiante #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Grado: ");
            String grado = entrada.nextLine();

            System.out.print("¿Estimado representante se le otorgó permiso al "
                    + "estudiante? Ingrese 1 para Sí o 2 para No:");
            int permiso = entrada.nextInt();
            entrada.nextLine();

            estudiantes[i] = new Problema3_Autobus(nombre, grado, permiso);
        }

        int aceptados = 0;
        int rechazados = 0;

        System.out.println("\n--- Revisión de acceso al transporte ---");

        for (int i = 0; i < cantEstudiantes; i++) {
            System.out.println(estudiantes[i].toString());

            if (estudiantes[i].permiso_Obtenido()) {
                System.out.println("Tiene autorización.");
                System.out.println("Acceso al bus concedido.\n");
                aceptados++;
            } else {
                System.out.println("No cuenta con autorización.");
                System.out.println("Acceso al bus denegado.\n");
                rechazados++;
            }

            System.out.println("--- Resumen del día ---");
            System.out.println("Total autorizados: " + aceptados);
            System.out.println("Total denegados: " + rechazados);
        }
    }
}
