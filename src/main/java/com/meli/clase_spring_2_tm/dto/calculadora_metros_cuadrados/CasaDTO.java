package com.meli.clase_spring_2_tm.dto.calculadora_metros_cuadrados;

import java.util.List;

public class CasaDTO {
    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;
    private double valorMetroCuadrado;


    public CasaDTO(String nombre, String direccion, List<HabitacionDTO> habitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.valorMetroCuadrado = 800;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<HabitacionDTO> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<HabitacionDTO> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public double metrosCuadrados() {
        double metrosTotales = 0;
        for (HabitacionDTO h : habitaciones) {
            metrosTotales += h.metrosCuadrados();
        }
        return metrosTotales;
    }
}