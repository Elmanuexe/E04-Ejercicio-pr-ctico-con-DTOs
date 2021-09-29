package triana.salesianos.dam.E04.E01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class AlumnoPlusDTO {

    private String nombre;
    private String apellidos;
    private String email;
    private Long curso;
    private Long direccion;
}
