import java.util.ArrayList;
import java.util.List;

public class Cooperative {
    public String name;
    private List<Bus> busList;

    public Cooperative(String name) {
        this.name = name;
        this.busList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bus> getBusList() {
        return busList;
    }

    public void setBusList(List<Bus> busList) {
        this.busList = busList;
    }

    public void addBus(Bus bus) {
        if (bus != null) {
            this.busList.add(bus);
            System.out.println("Bus con placa " + bus.getPlate() + " agregado exitosamente.");
        } else {
            System.out.println("Error: No se puede agregar un bus nulo.");
        }
    }
}
