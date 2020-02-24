package office_hour.officeHour_02_11_20;

import static office_hour.officeHour_02_11_20.Parent.hello;

public class Family {
    public static void main(String[] args) {

        Parent p1 = new Parent("Naj", 42,1234567890);
        System.out.println(hello());
        p1.getAge();
        p1.getName();
        System.out.println(p1.getSsn());
        System.out.println(p1);

    }
}
