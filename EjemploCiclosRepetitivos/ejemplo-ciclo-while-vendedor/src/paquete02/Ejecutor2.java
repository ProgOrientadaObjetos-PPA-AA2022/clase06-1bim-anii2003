/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

public class Ejecutor2 {

    public static void main(String[] args) {
        // variables para ingreso de datos
        String nombre;
        int edad;
        double sMinino;
        int autos;
        boolean bandera;
        String opcion;
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
        // Inicio de proceso iterativo 
        bandera = true;
        cadenaFinal = ""; // inicializo la variable que contendrá la cadena
        // final.
        while (bandera) { // bandera == true
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino, autos);
            v.calcularPagoMensual();
            cadenaFinal = String.format("%s%s\n",
                    cadenaFinal,
                    v);

            entrada.nextLine(); // limpieza del buffer
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + " salir");
            opcion = entrada.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }

        }
        // cuando se sale del ciclo repetitivo debemos presentar en pantalla
        // el valor de cadena final
        System.out.printf("%s\n", cadenaFinal);
    }
}
