package tasktwo;

public class Main {
    public static void main(String... args) {
        Author author = new Author("Роберт Мартин", "robert_martin@gmail.com", 'm');
        Book book = new Book("Чистый код", author, 800, 5);
        System.out.println(author);
        System.out.println(book);
    }
}
