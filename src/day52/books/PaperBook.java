package day52.books;

public class PaperBook extends Book implements Readable {

    int weight;
    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void read() {
        System.out.println("Reading " + name + " by " + author);
    }

    @Override
    public void displayBookInfo() {
        System.out.println("This paper book's name is \"" + name
                + ",\" and the author is " + author + ". The book weighs " + weight + " pounds.");
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes and bookmarking the " + name + " book.");
    }

    @Override
    public void showTableOfContent() {

    }

    @Override
    public String toString() {
        return "PaperBook {" +
                "weight = " + weight +
                ", name = '" + name + '\'' +
                ", author = '" + author + '\'' +
                '}';
    }
}
