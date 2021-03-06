package triana.salesianos.dam.E04.E01.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data @NoArgsConstructor @AllArgsConstructor
public class AlumnoDTO {

    private String nombre;
    private String apellidos;
    private String email;
    private String curso;
    private String direccion;


}
