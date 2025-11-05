package org.example.DemoFacultad.models;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReadOnly;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Estudiante {
    @Id
    @SequenceGenerator(
        name = "EstudianteSeq", sequenceName = "EstudianteSeq",
        allocationSize = 1, initialValue = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE, generator = "EstudianteSeq"
    )
    @ReadOnly
    private Integer id;

    @Column(unique = true, nullable = false)
    private String cif;

    private String nombre;
    private String descripcion;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Carrera> carreras;

    @Override
    public String toString() {
        return "Estudiante{" + "id=" + id + ", cif='" + cif + '\'' +
               ", nombre='" + nombre + '\'' + ", descripcion='" + descripcion +
               '\'' + '}';
    }
}
