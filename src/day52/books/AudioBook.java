package day52.books;

public class AudioBook extends Book {

    double duration;
    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("This audio-book's name is "
                + "\"" + name+".\" The author is "+author+". Book Duration is "+duration+" hours.");
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes while listening to \"" + name+",\" by " + author+".");
    }

    @Override
    public void showTableOfContent() {

    }

    @Override
    public String toString() {
        return "AudioBook {" + "name = '" + name + '\'' +
                ", author = '" + author +" Duration " + duration + '\'' + '}';
    }
}
