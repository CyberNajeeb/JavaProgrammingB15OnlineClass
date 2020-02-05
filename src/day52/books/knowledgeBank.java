package day52.books;

public interface knowledgeBank {

    void takeNote();
    default void showTableOfContent(){
        System.out.println("This book has 29 chapters.");
    }

}
