public class Main {
    public static void main(String[] args) {
        Cooperative coOp = new Cooperative("Transportes del Norte");

        Bus bus1 = new Bus(45, "NIC-1234");
        Bus bus2 = new Bus(50, "NIC-5678");
        Bus bus3 = new Bus(40, "NIC-9012");

        coOp.addBus(bus1);
        coOp.addBus(bus2);
        coOp.addBus(bus3);

        coOp.addBus(new Bus(35, "NIC-3456"));
    }
}