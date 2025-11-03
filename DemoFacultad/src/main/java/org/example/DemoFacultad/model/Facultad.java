package org.example.DemoFacultad.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ReadOnly;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Facultad {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "FacultadSeq", sequenceName = "FacultadSeq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FacultadSeq")
    @ReadOnly
    private int id;

    private String nombre;
    private String descripcion;

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

    @Override
    public String toString() {
        return "Facultad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
