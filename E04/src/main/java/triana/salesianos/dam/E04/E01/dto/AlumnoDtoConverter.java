package triana.salesianos.dam.E04.E01.dto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import triana.salesianos.dam.E04.E01.Alumno;
import triana.salesianos.dam.E04.E01.CursoRepository;
import triana.salesianos.dam.E04.E01.DireccionRepository;


@Component
public class AlumnoDtoConverter {

    @Autowired
    CursoRepository repositorioCurso;
    @Autowired
    DireccionRepository repositorioDireccion;


    // De los DTO a ALUMNO

    // De AlumnoDTO a Alumno
    public Alumno alumnoDtoToAlumno (AlumnoDTO dto)
    {
        Alumno alumno=new Alumno();
        alumno.setNombre(dto.getNombre());
        alumno.setApellido1(dto.getApellidos().split((","),0).toString());
        alumno.setApellido2(dto.getApellidos().split((","),1).toString());
        alumno.setEmail(dto.getEmail());
        return alumno;
    }

    // De AlumnoPlusDTO al Alumno
    public  Alumno alumnoPlusDtoToAlumno (AlumnoPlusDTO dtoPlus)
    {
        Alumno alumno=new Alumno();
        alumno.setNombre(dtoPlus.getNombre());
        alumno.setApellido1(dtoPlus.getApellidos().split((","),0).toString());
        alumno.setApellido2(dtoPlus.getApellidos().split((","),1).toString());
        alumno.setEmail(dtoPlus.getEmail());
        alumno.setDireccion(repositorioDireccion.getById(dtoPlus.getDireccion()));
        alumno.setCurso(repositorioCurso.getById(dtoPlus.getCurso()));
        return alumno;
    }



    // De Alumno a los diferentes DTO

    // De Alumno normal a AlumnoDTO solo para mostrar "bonito"
    public AlumnoDTO alumnoToAlumnoDTO (Alumno alumno)
    {
        AlumnoDTO dto=new AlumnoDTO();
        dto.setNombre(alumno.getNombre());
        dto.setApellidos(String.format("%s (%s)", alumno.getApellido1(), alumno.getApellido2()));
        dto.setEmail(alumno.getEmail());
        dto.setCurso(alumno.getCurso().getNombre());
        dto.setDireccion(String.format("Provincia:%s ,Población:%s ,%s ,%s",
                alumno.getDireccion().getProvincia(),
                alumno.getDireccion().getPoblacion(),
                alumno.getDireccion().getCp(),
                alumno.getDireccion().getLinea1()));
        return dto;
    }

    // De Alumno a AlumnoPlusDTO que lleva las ids de la dirección y el curso por si lo necesitásemos
    public AlumnoPlusDTO alumnoToAlumnoPlusDTO (Alumno alumno)
    {
        AlumnoPlusDTO dtoPlus=new AlumnoPlusDTO();
        dtoPlus.setNombre(alumno.getNombre());
        dtoPlus.setApellidos(String.format("%s (%s)", alumno.getApellido1(), alumno.getApellido2()));
        dtoPlus.setCurso(alumno.getCurso().getId());
        dtoPlus.setDireccion(alumno.getDireccion().getId());
        return dtoPlus;
    }

}
