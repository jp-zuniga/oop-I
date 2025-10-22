package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import models.Factura;

import java.util.List;

public class ImplDAOFactura implements DAOFactura {
    @Override
    public List<Factura> getAll(String nameQuery) {
        try (EntityManager em = EntityManagerAdmin.getInstance()) {
            TypedQuery<Factura> query = em.createNamedQuery(nameQuery, Factura.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void insert(Factura entity) {
        try (EntityManager em = EntityManagerAdmin.getInstance()) {
            em.getTransaction().begin();
            em.persist(entity);
            em.flush();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
