package com.meli.clase_spring_2_tm.controller.calculadora_metros_cuadrados;

import com.meli.clase_spring_2_tm.dto.calculadora_metros_cuadrados.CasaDTO;
import com.meli.clase_spring_2_tm.service.calculadora_metros_cuadrados.CalculadoraMetrosCuadradosService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculadora_metros_cuadrados")
public class CalculadoraMetrosCuadradosController {

    @PostMapping("/casa")
    public ResponseEntity calcularDatosCasa(@RequestBody CasaDTO casa) {
        return new ResponseEntity(CalculadoraMetrosCuadradosService.mapearRespuesta(casa), HttpStatus.OK);
    }
}
