package service;

import models.Sucursal;

import java.util.List;

public interface IDAOSucursal {
    List<Sucursal> getAll(String nameQuery);

    void insert(Sucursal entity);
}
