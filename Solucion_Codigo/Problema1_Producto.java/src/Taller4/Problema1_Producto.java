/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author admin
 */
class Producto {

    public double precioProducto;
    public int numProductos;
    public double costoTotal;
    public double costoDescuento;
    public int descuento;
    public String nombreProducto;

    public Producto(double precioProducto, int numProductos, String nombre) {
        this.precioProducto = precioProducto;
        this.numProductos = numProductos;
        this.nombreProducto = nombre;

    }

    public int calcularDescuento(double precioPruduc, int numProd) {
        if (precioPruduc >= 1000 && numProd >= 10) {
            descuento = 10;
        } else {
            descuento = 5;
        }
        return descuento;
    }

    public void calcularPrecioCompra(double precioProduc, int precioProd) {
        costoTotal = precioProduc * precioProd;
        costoDescuento = costoTotal - (costoTotal * descuento / 100);

    }

    @Override
    public String toString() {
        return String.format("""
                                 Producto:
                                 Nombre del producto: %s
                                 Precio del Producto: %.2f
                                 Cantidad de producto: %d
                                 Precio sin descuento: %.2f
                                 Descuento aplicado: %d
                                 Precio con descuento aplicado: %.2f\n
                                 """,
                nombreProducto,
                precioProducto,
                numProductos,
                costoTotal,
                descuento,
                costoDescuento);
    }

}
