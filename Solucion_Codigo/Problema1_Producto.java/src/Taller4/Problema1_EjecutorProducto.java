/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author admin
 */
public class Problema1_EjecutorProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1000, 10);
        
        producto1.calcularDescuento(producto1.precioP, producto1.cantidadP);
        producto1.calcularPrecioFinal();
        
        System.out.println(producto1.toString());
    }
}