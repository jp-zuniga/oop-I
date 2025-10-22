import models.Factura;
import services.DAOFactura;
import services.ImplDAOFactura;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DAOFactura dao = new ImplDAOFactura();
        Factura entity = new Factura();

        entity.setNumeroFactura(1);
        entity.setTotal(74.9);
        entity.setNombreCliente("kevin");
        entity.setFecha(new Date());

        dao.insert(entity);

        List<Factura> lista = dao.getAll("Factura.All");
        lista.forEach(System.out::println);
    }
}
