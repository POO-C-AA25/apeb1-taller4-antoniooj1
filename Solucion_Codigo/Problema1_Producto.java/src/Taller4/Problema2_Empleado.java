/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4;

/**
 *
 * @author admin
 */
class Problema2_Empleado{
public String nombre;
    public double salario;
    public int edad;
    public double aumento;

    public Problema2_Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.aumento= aumento;
    }
    

    public String toString() {
        return "Problema2_Empleado{" + "nombre=" + nombre + ", salario=" +
                salario + ", edad=" + edad + ", aumento=" + aumento + '}';
    }
}
    