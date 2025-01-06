package mx.com.crud.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class SaludoDto {

    private String saludo;

    public SaludoDto(String saludo) {
        this.saludo = saludo;
    }
}
