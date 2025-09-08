public class Main {
    public static void main(String[] args) {
        Product producto1 = new Product();
        producto1.setName("Tubo PVC Sch40");
        producto1.setPrice(15.50);
        producto1.setStock(100);

        Product producto2 = new Product("Cemento gris", 25.75);
        producto2.setStock(50);

        Product producto3 = new Product("Ladrillo rojo", 2.30, 500);
        Product producto4 = new Product("Arena fina", 18.90, 200);
        Product producto5 = new Product("Pintura blanca", 45.60, 30);

        System.out.println("=== PRODUCTOS DE CONSTRUCCIÓN ===");
        System.out.println("1. " + producto1);
        System.out.println("2. " + producto2);
        System.out.println("3. " + producto3);
        System.out.println("4. " + producto4);
        System.out.println("5. " + producto5);

        System.out.println("\n=== INFORMACIÓN DETALLADA ===");
        System.out.println("Producto: " + producto3.getName());
        System.out.println("Precio: $" + producto3.getPrice());
        System.out.println("Stock: " + producto3.getStock() + " unidades");
        System.out.println("Valor total en inventario: $" + (producto3.getPrice() * producto3.getStock()));

        Product producto6 = new Product("Varilla corrugada 1/2", 85.40, 80);
        Product producto7 = new Product("Yeso", 12.80);

        System.out.println("\n=== PRODUCTOS ADICIONALES ===");
        System.out.println("6. " + producto6);
        System.out.println("7. " + producto7 + " (stock no definido)");
    }
}