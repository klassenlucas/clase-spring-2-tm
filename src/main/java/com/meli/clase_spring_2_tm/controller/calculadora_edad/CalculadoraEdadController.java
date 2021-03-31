package com.meli.clase_spring_2_tm.controller.calculadora_edad;

import com.meli.clase_spring_2_tm.dto.calculadora_metros_cuadrados.CasaDTO;
import com.meli.clase_spring_2_tm.service.calculadora_edad.CalculadoraEdadService;
import com.meli.clase_spring_2_tm.service.calculadora_metros_cuadrados.CalculadoraMetrosCuadradosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("calculadora_edad")
public class CalculadoraEdadController {
    @GetMapping("/{day}/{month}/{year}")
    public ResponseEntity calcularEdad(@PathVariable int day,@PathVariable int month,@PathVariable int year) {
        System.out.println(day + "" + month + "" + year);
        return new ResponseEntity(CalculadoraEdadService.getEdad(day,month,year), HttpStatus.OK);
    }
}
