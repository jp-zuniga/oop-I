package services;

import models.AnioPublicacion;

import java.util.List;

public interface IDAOAnioPublicacion {
    List<AnioPublicacion> getAll(String nameQuery);

    void insert(AnioPublicacion entity);

    void update(AnioPublicacion entity);

    void delete(AnioPublicacion entity);

    AnioPublicacion findById(Integer id);
}
