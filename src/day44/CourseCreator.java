package day44;

public class CourseCreator {

    public static void main(String[] args) {

        Course c1 = new Course("Java", "Foundation");
        Course c2 = new Course("Selenium", "Automation");
        Course c3 = new Course("SQL", "Database");
        Course c4 = new Course("API", "Web Services");
        Course c5 = new Course("Agile", "Soft Skills");
        System.out.println("Course.counter = " + Course.counter);
        System.out.println("Course = " + Course.class);
    }
}
