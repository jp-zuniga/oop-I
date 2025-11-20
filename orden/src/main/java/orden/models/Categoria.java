package orden.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Categoria extends BaseEntity {
    private String nombre;
    private String descripcion;
}
