package com.meli.clase_spring_2_tm.service.calculadora_metros_cuadrados;

import com.meli.clase_spring_2_tm.dto.calculadora_metros_cuadrados.CalculadoraMetrosCuadradosDTO;
import com.meli.clase_spring_2_tm.dto.calculadora_metros_cuadrados.CasaDTO;
import com.meli.clase_spring_2_tm.dto.calculadora_metros_cuadrados.HabitacionDTO;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class CalculadoraMetrosCuadradosService {


    public static CalculadoraMetrosCuadradosDTO mapearRespuesta(CasaDTO casa) {
        return new CalculadoraMetrosCuadradosDTO(
                casa.metrosCuadrados(),
                casa.metrosCuadrados()*casa.getValorMetroCuadrado(),
                getHabitacionMasGrande(casa),
                getMetrosCuadradosPorHabitacion(casa)
                );
    }

    private static HabitacionDTO getHabitacionMasGrande(CasaDTO casa) {
        return casa.getHabitaciones().stream().max(Comparator.comparing(HabitacionDTO::metrosCuadrados)).orElseThrow(NoClassDefFoundError::new);
    }

    private static Map<HabitacionDTO,Double> getMetrosCuadradosPorHabitacion(CasaDTO casa) {
        Map<HabitacionDTO,Double> map = new HashMap<>();
        for (HabitacionDTO h: casa.getHabitaciones()) {
            map.put(h,h.metrosCuadrados());
        }
        return map;
    }
}
