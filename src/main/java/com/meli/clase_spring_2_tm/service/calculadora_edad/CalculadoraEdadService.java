package com.meli.clase_spring_2_tm.service.calculadora_edad;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class CalculadoraEdadService {
    public static int getEdad(int day, int month, int year) {
        LocalDate actual = LocalDate.now();
        LocalDate requestDate = LocalDate.of(year,month,day);
        return Period.between(requestDate,actual).getYears();
    }
}
