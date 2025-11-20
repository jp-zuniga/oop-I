package DemoFacultad.models;

import org.openxava.annotations.ReadOnly;
import org.openxava.annotations.Required;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Carrera {
    @Id
    @SequenceGenerator(
        name = "CarreraSeq",
        sequenceName = "CarreraSeq",
        allocationSize = 1,
        initialValue = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "CarreraSeq"
    )
    @ReadOnly
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "idFacultad",
        referencedColumnName = "id"
    )
    private Facultad facultad;

    @ManyToMany(
        fetch = FetchType.LAZY,
        mappedBy = "carreras"
    )
    private Set<Estudiante> estudiantes;

    @Required
    private String nombre;
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(
        Set<Estudiante> estudiantes
    ) {
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", facultad=" + facultad + ", nombre='"
               + nombre + '\'' + ", descripcion='" + descripcion + '\'' + '}';
    }
}
