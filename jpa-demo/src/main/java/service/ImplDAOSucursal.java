package service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import model.Sucursal;

import java.util.List;

public class ImplDAOSucursal implements IDAOSucursal {
    @Override
    public List<Sucursal> getAll(String nameQuery) {
        try (EntityManager em = EntityManagerAdmin.getInstance()) {
            TypedQuery<Sucursal> query = em.createNamedQuery(nameQuery, Sucursal.class);
            return query.getResultList();
        } catch (Exception e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void insert(Sucursal entity) {
        try (EntityManager em = EntityManagerAdmin.getInstance()) {
            em.getTransaction().begin();
            em.persist(entity);
            em.flush();
            em.getTransaction().commit();
        } catch (Exception e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        }
    }
}
