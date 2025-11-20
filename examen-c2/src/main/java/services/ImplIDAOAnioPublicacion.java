package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import models.AnioPublicacion;

import java.util.List;

public class ImplIDAOAnioPublicacion implements IDAOAnioPublicacion {
    @Override public List<AnioPublicacion> getAll(String nameQuery) {
        EntityManager entityManager = EntityManagerAdmin.getInstance();
        try {
            TypedQuery<AnioPublicacion> query =
                entityManager.createNamedQuery(nameQuery,
                AnioPublicacion.class
            );
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return null;
    }

    @Override public void insert(AnioPublicacion entity) {
        EntityManager entityManager = EntityManagerAdmin.getInstance();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    @Override public void update(AnioPublicacion entity) {
        EntityManager entityManager = EntityManagerAdmin.getInstance();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    @Override public void delete(AnioPublicacion entity) {
        EntityManager entityManager = EntityManagerAdmin.getInstance();
        try {
            entityManager.getTransaction().begin();
            AnioPublicacion p = entityManager.find(
                AnioPublicacion.class,
                entity.getId()
            );
            if (p != null) {
                entityManager.merge(p);
            }

            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    @Override public AnioPublicacion findById(Integer id) {
        EntityManager entityManager = EntityManagerAdmin.getInstance();
        try {
            return entityManager.find(AnioPublicacion.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return null;
    }
}
