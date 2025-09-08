public class Bus {
    public int capacity;
    private String plate;

    public Bus(int capacity, String plate) {
        this.capacity = capacity;
        this.plate = plate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
