public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Ingenieria en Sistemas", "Kevin Browne", "12345678");
        Estudiante est2 = new Estudiante("Ingenieria Industrial", "Alicia Estrada", "87654321");
        Estudiante est3 = new Estudiante("Diseno Grafico", "Dani Meza", "43218765");

        System.out.println(est1.getId());
        System.out.println(est1.getNombre());
        System.out.println(est1.carrera);
        System.out.println();

        System.out.println(est2.getId());
        System.out.println(est2.getNombre());
        System.out.println(est2.carrera);
        System.out.println();

        System.out.println(est3.getId());
        System.out.println(est3.getNombre());
        System.out.println(est3.carrera);
        System.out.println();
    }
}