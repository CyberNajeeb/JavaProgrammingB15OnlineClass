package day44;

public class Course {

    String name, type;
    static int counter;

    public Course (String name, String type){
        this.name = name;
        this.type = type;
        counter++;
    }
}
