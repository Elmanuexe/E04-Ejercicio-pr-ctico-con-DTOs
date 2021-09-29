package triana.salesianos.dam.E04.E02.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductoDTO {

    private String nombre;
    private Double pvp;
    private String imagen;
    private String categoria;
}
