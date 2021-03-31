package com.meli.clase_spring_2_tm.dto.calculadora_metros_cuadrados;

import java.util.HashMap;
import java.util.Map;

public class CalculadoraMetrosCuadradosDTO {
    double metrosCuadradosCasa;
    double valorDeCasa;
    HabitacionDTO habitacionMasGrande;
    Map<HabitacionDTO,Double> metrosCuadradosPorHabitacion;

    public CalculadoraMetrosCuadradosDTO(double metrosCuadradosCasa, double valorDeCasa, HabitacionDTO habitacionMasGrande, Map<HabitacionDTO,Double> metrosCuadradosPorHabitacion) {
        this.metrosCuadradosCasa = metrosCuadradosCasa;
        this.valorDeCasa = valorDeCasa;
        this.habitacionMasGrande = habitacionMasGrande;
        this.metrosCuadradosPorHabitacion = metrosCuadradosPorHabitacion;
    }


    public double getMetrosCuadradosCasa() {
        return metrosCuadradosCasa;
    }

    public void setMetrosCuadradosCasa(double metrosCuadradosCasa) {
        this.metrosCuadradosCasa = metrosCuadradosCasa;
    }

    public double getValorDeCasa() {
        return valorDeCasa;
    }

    public void setValorDeCasa(double valorDeCasa) {
        this.valorDeCasa = valorDeCasa;
    }

    public HabitacionDTO getHabitacionMasGrande() {
        return habitacionMasGrande;
    }

    public void setHabitacionMasGrande(HabitacionDTO habitacionMasGrande) {
        this.habitacionMasGrande = habitacionMasGrande;
    }

    public Map<HabitacionDTO,Double>  getMetrosCuadradosPorHabitacion() {
        return metrosCuadradosPorHabitacion;
    }

    public void setMetrosCuadradosPorHabitacion(Map<HabitacionDTO,Double> metrosCuadradosPorHabitacion) {
        this.metrosCuadradosPorHabitacion = metrosCuadradosPorHabitacion;
    }

}
