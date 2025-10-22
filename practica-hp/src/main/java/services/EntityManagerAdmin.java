package services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {
    private static final String PERSISTENCE_UNIT = "practica-hp";
    private static EntityManager instance;

    public static EntityManager getInstance() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        instance = emf.createEntityManager();
        return instance;
    }
}
