/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class LibretaCalificacion {

    private String estudiante;
    private double promedio;
    private String promedioCualitativo;
    private double[] calificaciones;

    public LibretaCalificacion(String n, double[] c) {
        estudiante = n;
        calificaciones = c;
    }

    public void establecerEstudiante(String n) {
        estudiante = n;
    }

    public void establecerPromedio() { // No tiene parámetros ya que trabaja en función de lo que tiene
        double suma = 0;

        // for (int i = 0; i < calificaciones.length; i++) {
        for (int i = 0; i < obtenerCalificaciones().length; i++) {
            suma = suma + obtenerCalificaciones()[i];
        }

        promedio = suma / obtenerCalificaciones().length;
        // O también puede ser
        // promedio = suma / calificaciones.legth
    }

    public void establecerPromedioCualitativo() {
        /*if ((obtenerPromedio() >= 0) && (obtenerPromedio() <= 3.09)) {*/
        if ((promedio >= 0) && (promedio <= 3.09)) {
            promedioCualitativo = "Regular";
        } else {
            if ((obtenerPromedio() >= 3.1) && (obtenerPromedio() <= 5.09)) {
                promedioCualitativo = "Insuficiente";
            } else {
                if ((obtenerPromedio() >= 5.1) && (obtenerPromedio() <= 7.09)) {
                    promedioCualitativo = "Bueno";
                } else {
                    if ((obtenerPromedio() >= 7.1) && (obtenerPromedio() <= 9.09)) {
                        promedioCualitativo = "Muy bueno";
                    } else {
                        if ((obtenerPromedio() >= 9.1) && (obtenerPromedio() <= 10)) {
                            promedioCualitativo = "Sobresaliente";
                        } else {
                            promedioCualitativo = "Sin rango";
                        }
                    }
                }
            }
        }
    }

    public void establecerCalificaciones(double[] n) {
        calificaciones = n;
    }

    public String obtenerEstudiante() {
        return estudiante;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    public String obtenerPromedioCualitativo() {
        return promedioCualitativo;
    }

    public double[] obtenerCalificaciones() {
        return calificaciones;
    }

    @Override
    public String toString() {
        String cadena = "Libreta de Calificaciones\n";
        cadena = String.format("%sNombre: %s\nCalificaciones:\n", cadena,
                obtenerEstudiante());
        for (int i = 0; i < obtenerCalificaciones().length; i++) {
            cadena = String.format("%s\t%.2f%s\n", cadena,
                    obtenerCalificaciones()[i],"/10.0");
        }
        cadena = String.format("%sPromedio calificaciones:\n\t%.2f\n"
                + "Promedio cuantitativo:\n\t%s\n",
                cadena, obtenerPromedio(), obtenerPromedioCualitativo().toUpperCase());
        return cadena;
    }
}
