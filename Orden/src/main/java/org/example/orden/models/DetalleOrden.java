package org.example.orden.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Embeddable
@Getter
@Setter
public class DetalleOrden {
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto   producto;
    private Integer    cantidad;
    private BigDecimal precioPorUnidad;
}
