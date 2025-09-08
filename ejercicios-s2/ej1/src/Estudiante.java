public class Estudiante {
    public String carrera;
    public String nombre;
    private String id;

    public Estudiante(String carrera, String nombre, String id) {
        this.carrera = carrera;
        this.nombre = nombre;
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() < 8) {
            System.out.println("El ID de un estudiante debe tener 8 caracteres.");
        }

        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
