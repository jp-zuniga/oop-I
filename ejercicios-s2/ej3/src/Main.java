public class Main {
    public static void main(String[] args) {
        Author rubenDario = new Author("Rubén Darío");
        Author ernestoCardenal = new Author("Ernesto Cardenal");

        Book azul = new Book("Azul", rubenDario);
        Book prosasProfanas = new Book("Prosas Profanas", rubenDario);
        Book cantoCosmico = new Book("Canto Cósmico", ernestoCardenal);
        
        Author autorDeAzul = azul.getAuthor();
        System.out.println("El autor de 'Azul' es: " + autorDeAzul.getName());

        System.out.println("\nObras de Rubén Darío:");
        System.out.println("- " + azul.getTitle());
        System.out.println("- " + prosasProfanas.getTitle());
    }
}