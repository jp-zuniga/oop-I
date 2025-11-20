package orden.calculators;

import lombok.Getter;
import lombok.Setter;
import org.openxava.calculators.ICalculator;
import org.openxava.jpa.XPersistence;

import javax.persistence.Query;

public class CalculatorNumero implements ICalculator {
    @Getter
    @Setter
    private Integer anioFiscal;

    @Override
    public Integer calculate() throws Exception {
        String query_str =
            "select max(o.numero) from orden as o where o.anioFiscal = "
            + ":anioFiscal";

        Query q = XPersistence.getManager().createQuery(query_str);
        q.setParameter("anioFiscal", anioFiscal);

        Integer numero = (Integer) q.getSingleResult();

        return numero == null ? 1 : numero + 1;
    }
}
