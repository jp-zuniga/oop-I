import model.Sucursal;
import service.IDAOSucursal;
import service.ImplDAOSucursal;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IDAOSucursal dao = new ImplDAOSucursal();
        List<Sucursal> lista = dao.getAll("Sucursal.All");
        lista.forEach(System.out::println);
    }
}
