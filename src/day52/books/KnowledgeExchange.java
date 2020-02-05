package day52.books;

import java.util.Arrays;
import java.util.List;

public class KnowledgeExchange {
    public static void main(String[] args) {

        PaperBook b1 = new PaperBook("The Becoming", "Mitchelle Obama", 3);

        Book b2 = new PaperBook("Selenium", "Vasyl", 5);
        Book b3 = new PaperBook("Java", "Akbar", 3);
        Book b4 = new PaperBook("How to Un-F*ck Yourself", "The Scottish Man", 5);
        Book b5 = new PaperBook("The Kite Runner", "Khaled Hoseini", 9);

        Book b6 = new AudioBook("The Becoming", "Michelle Obama", 3.28);
        Book b7 = new AudioBook("How to Un-F*ck Yourself", "The Scottish Man", 5.43);
        Book b8 = new AudioBook("Game of Thrones", "George R. R. Martin", 5.9);

        //This is the very similar idea as placing a small cup into a large cup, which is always possible.
        knowledgeBank kb = b7;
        kb.takeNote();
        kb.showTableOfContent();

        List<Book> bookList = Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8);
        for (Book each : bookList) {
            each.displayBookInfo();
        }
    }
}
