import models.Publicacion;
import services.IDAOAnioPublicacion;
import services.IDAOPublicacion;
import services.ImplIDAOAnioPublicacion;
import services.ImplIDAOPublicacion;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDAOAnioPublicacion anioDao = new ImplIDAOAnioPublicacion();

        IDAOPublicacion dao = new ImplIDAOPublicacion();
        Publicacion     pub = new Publicacion();
        pub.setAnio(anioDao.findById(1));
        pub.setNombre("test");
        pub.setFecha(new Date());
        pub.setTitulo("1984");

        dao.insert(pub);

        List<Publicacion> lista = dao.getAll("Publicacion.PorAnio");
        lista.forEach(System.out::println);
    }
}