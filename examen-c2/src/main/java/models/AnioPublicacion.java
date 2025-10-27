package models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "AnioPublicacion")
@NamedQueries({@NamedQuery(name = "AnioPublicacion.All", query = "select e from AnioPublicacion e")})
public class AnioPublicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private int anio;

    @Column
    private String descripcion;

    @OneToMany(
            mappedBy = "anio",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Publicacion> publicaciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public void addPublicacion(Publicacion p) {
        p.setAnio(this);
        this.publicaciones.add(p);
    }

    public void removePublicacion(Publicacion p) {
        this.publicaciones.remove(p);
        p.setAnio(null);
    }

    @Override
    public String toString() {
        return "AnioPublicacion{" +
                "id=" + id +
                ", anio=" + anio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
