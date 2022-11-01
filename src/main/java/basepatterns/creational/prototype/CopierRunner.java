package basepatterns.creational.prototype;

public class CopierRunner {
    public static void main(String[] args) {

        Book myBook = new Book(1, "The book about me", "D/:books/the book about me.txt");

        BookFactory bookFactory = new BookFactory(myBook);

        Book newCopyBook = bookFactory.cloneBook();

        System.out.println(myBook);
        System.out.println();
        System.out.println();
        System.out.println(newCopyBook);
    }
}
