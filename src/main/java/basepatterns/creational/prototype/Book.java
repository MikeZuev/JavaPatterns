package basepatterns.creational.prototype;

public class Book implements Copyable{
    private int id;
    private String bookName;
    private String sourceBook;

    public Book(int id, String bookName, String sourceBook) {
        this.id = id;
        this.bookName = bookName;
        this.sourceBook = sourceBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getSourceBook() {
        return sourceBook;
    }

    public void setSourceBook(String sourceBook) {
        this.sourceBook = sourceBook;
    }

    @Override
    public Object copy() {
        Book bookCopy = new Book(id, bookName, sourceBook);
        return bookCopy;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", sourceBook='" + sourceBook + '\'' +
                '}';
    }
}
