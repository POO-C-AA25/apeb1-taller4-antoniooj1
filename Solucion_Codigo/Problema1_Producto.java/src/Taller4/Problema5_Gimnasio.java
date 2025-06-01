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
public class Problema5_Gimnasio {
    public int totalTiempo = 0;
    public int totalCumplieron = 0;
    public double promedio;

    public void calcularEstadisticas(Problema5_Cliente[] clientes) {
        totalTiempo = 0;
        totalCumplieron = 0;

        for (Problema5_Cliente c : clientes) {
            totalTiempo += c.duracion;
            if (c.rutinaCompletada()) {
                totalCumplieron++;
            }
        }

        if (clientes.length > 0) {
            promedio = (double) totalTiempo / clientes.length;
        } else {
            promedio = 0;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Clientes que cumplieron la rutina: %d\n" +
                "Promedio de duración: %.2f minutos",
                totalCumplieron, promedio
        );
    }
}