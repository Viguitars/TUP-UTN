package clases.clase05_0904.Agregacion;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Person 1");
        Person person2 = new Person("Person 2");

        Book book1 = new Book("Book 1");
        Book book2 = new Book("Book 2");

        person1.addBook(book1);
        person1.addBook(book2);
        person2.addBook(book2);

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(book1);
        System.out.println(book2);
    }
}
