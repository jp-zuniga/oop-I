package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import models.Publicacion;

import java.util.List;

public class ImplIDAOPublicacion implements IDAOPublicacion {

    @Override
    public List<Publicacion> getAll(String nameQuery) {
        EntityManager entityManager = EntityManagerAdmin.getInstance();
        try {
            TypedQuery<Publicacion> query = entityManager.createNamedQuery(nameQuery, Publicacion.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
        
        return null;
    }

    @Override
    public void insert(Publicacion entity) {
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

    @Override
    public void update(Publicacion entity) {
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

    @Override
    public void delete(Publicacion entity) {
        EntityManager entityManager = EntityManagerAdmin.getInstance();
        try {
            entityManager.getTransaction().begin();
            Publicacion p = entityManager.find(Publicacion.class, entity.getId());
            if (p != null) {
                p.setRestrictiva(true);
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

    @Override
    public Publicacion findById(Integer id) {
        EntityManager entityManager = EntityManagerAdmin.getInstance();
        try {
            return entityManager.find(Publicacion.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }

        return null;
    }
}
