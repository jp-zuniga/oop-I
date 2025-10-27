import models.Publicacion;
import services.IDAOPublicacion;
import services.ImplIDAOPublicacion;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDAOPublicacion dao = new ImplIDAOPublicacion();
        Publicacion entity = new Publicacion();

        entity.setDescripcion("Publicación nueva");
        entity.setNombre("Publicación");
        entity.setTitulo("Post");
        entity.setFecha(new Date());

        dao.insert(entity);

        List<Publicacion> lista = dao.getAll("Publicacion.All");
        lista.forEach(System.out::println);
    }
}