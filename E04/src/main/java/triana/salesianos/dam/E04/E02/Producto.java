package triana.salesianos.dam.E04.E02;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String desc;
    private double pvp;
    
    @ElementCollection
    private List<String> imagenes;


    @ManyToOne
    private Categoria nombreCategoria;


}
