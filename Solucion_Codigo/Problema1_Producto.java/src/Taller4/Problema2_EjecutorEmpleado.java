/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Problema2_EjecutorEmpleado {


 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       Problema2_Empleado p;
        int opc, tam;
        System.out.println("Escriba el tamaño de la lista:");
        tam = entrada.nextInt();
        Problema2_Empleado list[] = new Problema2_Empleado[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Escriba el nombre, salario y "
                    + "edad del empleado " + (i));
            p = new Problema2_Empleado(entrada.next(), 
                    entrada.nextDouble(), entrada.nextInt());
            list[i] = p;
        }
        do {
            menu();
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    Problema2_Empleado templist[] = new Problema2_Empleado[tam];
                    System.arraycopy(list, 0, templist, 0, tam);
                    System.out.println("Escriba la cantidad "
                            + "de empleados para agregar:");
                    int most = entrada.nextInt();
                    list = new Problema2_Empleado[tam + most];
                    System.arraycopy(templist, 0, list, 0, tam);
                    for (int i = tam; i < tam + most; i++) {
                        System.out.println("Escriba el nombre, "
                                + "salario y edad del empleado " + (i));
                        p = new Problema2_Empleado(entrada.next(),
                                entrada.nextDouble(), entrada.nextInt());
                        list[i] = p;
                    }
                    System.out.println(list[0]);//prueba         
                    break;
               
                case 2:
                    System.out.println("Información de la lista:");
                    for (int i = 0; i < tam; i++) {
                        System.out.println(list[i]);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el porcentaje de"
                            + " aumento salarial:");
                    double porcentaje = entrada.nextDouble();
                    double sumaSalarios = 0;
                    for (Problema2_Empleado empleado : list) {
                        sumaSalarios += empleado.salario;
                    }
                    double salarioPromedio = sumaSalarios / list.length;
                    for (int i = 0; i < tam; i++) {
                        if (list[i].salario < salarioPromedio) {
                            list[i].salario *= (1 + porcentaje / 100);
                        }
                    } 
                    System.out.println("Aumento de salario aplicado"
                            + " correctamente.");
                    break;
                case 4:
                    opc = 4;
                    break;                    
                default:
                    System.out.println("Caracter no valido");
                    break;
            }
            System.out.println();
        } while (opc != 4);
        System.out.println("Programa finalizado.");
    }

    public static void menu() {
        System.out.println("Agregar empleado (1)\nMostrar información"
                + " (2)\nCalcular aumento de salario (3)\nSalir (4)");
    }
}
