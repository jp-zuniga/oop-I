package service;

import model.Sucursal;

import java.util.List;

public interface IDAOSucursal {
    List<Sucursal> getAll(String nameQuery);

    void insert(Sucursal entity);
}
