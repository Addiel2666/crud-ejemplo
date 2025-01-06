package mx.com.crud.controller;

import mx.com.crud.dto.SaludoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pruebas")
public class CrudController {

    @GetMapping(value = "/saludo", produces = "application/json")
    public ResponseEntity<?> servicioInicio(){
        return ResponseEntity.status(HttpStatus.OK).body(new SaludoDto("hola"));
    }

}
