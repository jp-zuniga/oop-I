package DemoFacultad.models;

import org.openxava.annotations.ReadOnly;
import org.openxava.annotations.Required;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Facultad {
    @Id
    @SequenceGenerator(
        name = "FacultadSeq",
        sequenceName = "FacultadSeq",
        allocationSize = 1,
        initialValue = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "FacultadSeq"
    )
    @ReadOnly
    private Integer id;

    @Required
    private String nombre;

    private String descripcion;

    @OneToMany(
        cascade = CascadeType.ALL,
        mappedBy = "facultad"
    )
    private Set<Carrera> carreras;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Set<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(Set<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Facultad{" + "id=" + id + ", nombre='" + nombre + '\''
               + ", descripcion='" + descripcion + '\'' + ", carreras="
               + carreras + '}';
    }
}
