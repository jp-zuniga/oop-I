package org.example.orden.models;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Files;
import org.openxava.annotations.Money;
import org.openxava.annotations.TextArea;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Producto extends BaseEntity {
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    private Categoria categoria;
    
    private String descripcion;

    @Money
    private BigDecimal precio;

    @Files
    @Column(length = 32)
    private String fotos;

    @TextArea
    private String observaciones;
}
