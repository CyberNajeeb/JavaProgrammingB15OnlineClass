package office_hour.officeHour_02_11_20;

public class Parent {
    String name;
    int age, ssn;

    public Parent(String name, int age, int ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }
    public static void hi(){
        System.out.println("Hi");
    }
    public static String hello(){
        System.out.println(123);
        System.out.println(true);
        System.out.println('A');
        hi();
        return "hello";
    }

    public String getName() {
        System.out.println("name is " + name);
        return name;
    }

    public int getAge() {
        System.out.println("age is " + age);
        return age;
    }

    public int getSsn() {
        //System.out.println("ssn = " + ssn);
        return ssn;
    }
}
