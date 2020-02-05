package day52.books;

public abstract class Book implements knowledgeBank{
    String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void paperBook(int weight) {

    }

    public void audioBook(double duration) {

    }

    public abstract void displayBookInfo();

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}