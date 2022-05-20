/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class Ejemplo04 {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = new Calificacion[4];
        
        Calificacion c = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(9, "Electrónica");
        Calificacion c3 = new Calificacion(9, "BD");
        Calificacion c4 = new Calificacion(5.5, "Lógica");
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        calificaciones[2] = c3;
        calificaciones[3] = c4;
        
        double acumulador = 0;
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            acumulador = acumulador + objetoCalificacion.obtenerNota();
        }
        
        double promedio = acumulador/calificaciones.length;
               
        System.out.printf("Promedio = %.2f\n",promedio);
    }
}
