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

        System.out.print("¿Cuantos estudiantes desea registrar? ");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); 

        Problema3_Autobus[] estudiantes = new Problema3_Autobus[cantidad];

        for (int i = 0; i < cantidad; i++) {
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

        System.out.println("\n--- Verificación de permiso ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(estudiantes[i].toString());

            if (estudiantes[i].tienePermiso()) {
                System.out.println("Permiso: Sí");
                System.out.println("Puede subir al bus\n");
                aceptados++;
            } else {
                System.out.println("Permiso: No");
                System.out.println("No puede subir al bus\n");
                rechazados++;
            }
        }

        System.out.println("--- Resumen del día ---");
        System.out.println("Permisos aceptados: " + aceptados);
        System.out.println("Permisos rechazados: " + rechazados);

    }
}