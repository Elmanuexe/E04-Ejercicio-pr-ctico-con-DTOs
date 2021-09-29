package triana.salesianos.dam.E04.E02.dto;

import org.springframework.stereotype.Component;
import triana.salesianos.dam.E04.E02.Producto;

@Component
public class ProductoToDto {

    public Producto productoDTOtoProducto(ProductoDTO pd){
        return new Producto(
                pd.getNombre(),
                pd.getPvp(),
                pd.getImagen(),
                pd.getCategoria()
        );
    }

    public ProductoDTO productoToProductoDto(Producto p){
        return ProductoDTO.builder()
                .nombre(p.getNombre())
                .pvp(p.getPvp())
                .imagen(p.getImagenes().get(0))
                .categoria(p.getNombreCategoria().toString())
                .build();
    }


}
