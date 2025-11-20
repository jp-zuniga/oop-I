package orden.models;

import lombok.Getter;
import lombok.Setter;
import orden.calculators.CalculatorNumero;
import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.ListProperties;
import org.openxava.annotations.PropertyValue;
import org.openxava.annotations.ReadOnly;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.calculators.CurrentYearCalculator;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter
@Setter
public class Orden extends BaseEntity {
    @ElementCollection
    @ListProperties("producto.nombre, cantidad, precioPorUnidad")
    Collection<DetalleOrden> detalles;

    @DefaultValueCalculator(CurrentYearCalculator.class)
    @ReadOnly
    private int anioFiscal;

    @DefaultValueCalculator(
        value = CalculatorNumero.class,
        properties = @PropertyValue(name = "anioFiscal")
    )
    @ReadOnly
    private Integer numero;

    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    @ReadOnly
    private LocalDate fecha;
    private String descripcion;
}
