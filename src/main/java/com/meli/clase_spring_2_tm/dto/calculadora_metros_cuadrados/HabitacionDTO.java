package com.meli.clase_spring_2_tm.dto.calculadora_metros_cuadrados;

public class HabitacionDTO {
    String nombre;
    double ancho;
    double largo;

    public HabitacionDTO(String nombre, double ancho, double largo) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.largo = largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double metrosCuadrados() {
        return this.largo * this.ancho;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
