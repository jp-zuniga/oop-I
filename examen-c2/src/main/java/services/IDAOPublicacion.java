package services;

import models.Publicacion;

import java.util.List;

public interface IDAOPublicacion {
    List<Publicacion> getAll(String nameQuery);

    void insert(Publicacion entity);

    void update(Publicacion entity);

    void delete(Publicacion entity);

    Publicacion findById(Integer id);
}
