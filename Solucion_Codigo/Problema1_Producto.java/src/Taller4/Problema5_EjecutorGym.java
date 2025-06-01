/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author admin
 */
public class Problema5_EjecutorGym {
    public static void main(String[] args) {
        Problema5_Cliente[] clientes = new Problema5_Cliente[3];
        clientes[0] = new Problema5_Cliente("Ana", "Cardio", 45, true);
        clientes[1] = new Problema5_Cliente("Luis", "Fuerza", 30, true);
        clientes[2] = new Problema5_Cliente("Sofia", "Estiramiento", 25, false);
        Problema5_Gimnasio gimnasio = new Problema5_Gimnasio();
        gimnasio.calcularEstadisticas(clientes);
        System.out.println(gimnasio.toString());
    }
}