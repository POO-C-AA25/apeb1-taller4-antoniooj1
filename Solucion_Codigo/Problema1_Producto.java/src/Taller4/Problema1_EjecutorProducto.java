
package Taller4;

import java.util.Scanner;

public class Problema1_EjecutorProducto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioProducto;
        int numProductos;
        System.out.println("Ingrese el precio de la prenda");
        precioProducto = entrada.nextDouble();
        System.out.println("Ingrese el numero de unidades que va a comprar");
        numProductos = entrada.nextInt();

        Producto Producto1 = new Producto(precioProducto, numProductos, "camiseta");

        Producto1.descuento = Producto1.calcularDescuento(Producto1.precioProducto, 
                Producto1.numProductos);
        Producto1.calcularPrecioCompra(Producto1.precioProducto, 
                Producto1.numProductos);

        System.out.println(Producto1.toString());
    }
}
