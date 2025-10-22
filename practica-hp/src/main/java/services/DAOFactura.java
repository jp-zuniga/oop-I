package services;

import models.Factura;

import java.util.List;

public interface DAOFactura {
    void insert(Factura entity);

    List<Factura> getAll(String nameQuery);
}
