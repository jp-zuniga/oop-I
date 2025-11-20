import models.Sucursal;
import service.IDAOSucursal;
import service.ImplDAOSucursal;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IDAOSucursal dao = new ImplDAOSucursal();
        Sucursal entity = new Sucursal();
        entity.setId(4);
        entity.setNombre("Jinotega");
        entity.setDescripcion("Sucursal de Jinotega");
        dao.insert(entity);

        List<Sucursal> lista = dao.getAll("Sucursal.All");
        lista.forEach(System.out::println);
    }
}
