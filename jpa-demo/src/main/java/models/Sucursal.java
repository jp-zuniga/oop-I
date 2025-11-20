package models;

import jakarta.persistence.*;

@Entity
@Table(name = "sucursal")
@NamedQueries(
    {
        @NamedQuery(
            name = "Sucursal.All",
            query = "select e from Sucursal e"
        )
    }
)
public class Sucursal {
    @Id
    private Integer id;

    @Column(
        name = "nombre",
        nullable = false,
        length = 50
    )
    private String nombre;

    @Column(
        name = "descripcion",
        nullable = false,
        length = 200
    )
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Sucursal{" + "id=" + id + ", nombre='" + nombre + '\''
               + ", descripcion='" + descripcion + '\'' + '}';
    }
}
