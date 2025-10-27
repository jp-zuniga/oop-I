package models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Publicacion")
@NamedQueries({@NamedQuery(name = "Publicacion.All", query = "select e from Publicacion e")})
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String descripcion;

    @Column
    private String nombre;

    @Column
    private Date fecha;

    @Column
    private String titulo;

    @Column
    private boolean restrictiva = false;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isRestrictiva() {
        return restrictiva;
    }

    public void setRestrictiva(boolean restrictiva) {
        this.restrictiva = restrictiva;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", titulo='" + titulo + '\'' +
                ", restrictiva=" + restrictiva +
                '}';
    }
}