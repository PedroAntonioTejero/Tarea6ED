/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.ed;

/**
 *
 * @author Pedro A Tejero
 */
public class Tarea6EDClase {
    private static final double DESCUENTO1 = 0.8;
    private static final double DESCUENTO2 = 0.95;
    public void aplicarDescuento(double precioProducto, int numProductos){     
     double total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            total = precioProducto*DESCUENTO1;
            descuentoTotal(total);
        }else {
            total = precioProducto*DESCUENTO2;
            descuentoTotal(total);
        }   
    }

    private void descuentoTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
    
}
