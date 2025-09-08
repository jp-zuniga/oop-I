import java.util.ArrayList;
import java.util.List;

public class House {
    private final List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
        createDefaultRooms();
    }

    public House(List<String> roomNames) {
        this.rooms = new ArrayList<>();
        createCustomRooms(roomNames);
    }

    private void createDefaultRooms() {
        String[] defaultRooms = {
                "Sala", "Cocina", "Comedor",
                "Dormitorio Principal", "Dormitorio Secundario",
                "Baño", "Estudio", "Lavandería"
        };

        for (String roomName : defaultRooms) {
            rooms.add(new Room(roomName));
        }
    }

    private void createCustomRooms(List<String> roomNames) {
        if (roomNames != null && !roomNames.isEmpty()) {
            for (String roomName : roomNames) {
                rooms.add(new Room(roomName));
            }
        } else {
            createDefaultRooms();
        }
    }

    public void addRoom(String roomName) {
        if (roomName != null && !roomName.trim().isEmpty()) {
            rooms.add(new Room(roomName));
            System.out.println("Habitación '" + roomName + "' agregada.");
        }
    }

    public boolean removeRoom(String roomName) {
        for (int i = 0; i < rooms.size(); i++) {
            if (rooms.get(i).getName().equalsIgnoreCase(roomName)) {
                Room removed = rooms.remove(i);
                System.out.println("Habitación '" + removed.getName() + "' eliminada.");
                return true;
            }
        }

        System.out.println("Habitación '" + roomName + "' no encontrada.");
        return false;
    }

    public List<Room> getRooms() {
        return new ArrayList<>(rooms);
    }

    public List<String> getRoomNames() {
        List<String> names = new ArrayList<>();
        for (Room room : rooms) {
            names.add(room.getName());
        }
        return names;
    }

    public int getTotalRooms() {
        return rooms.size();
    }

    public boolean hasRoom(String roomName) {
        for (Room room : rooms) {
            if (room.getName().equalsIgnoreCase(roomName)) {
                return true;
            }
        }
        
        return false;
    }

    public void showRooms() {
        if (rooms.isEmpty()) {
            System.out.println("La casa no tiene habitaciones.");
        } else {
            System.out.println("=== HABITACIONES DE LA CASA ===");
            for (int i = 0; i < rooms.size(); i++) {
                System.out.println((i + 1) + ". " + rooms.get(i).getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Casa con " + rooms.size() + " habitaciones";
    }
}
