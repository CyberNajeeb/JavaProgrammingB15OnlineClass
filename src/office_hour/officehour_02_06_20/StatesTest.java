package office_hour.officehour_02_06_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatesTest {
    public static void main(String[] args) {

        Kentucky k1 = new Kentucky();
        k1.ky();
        k1.tax();

        k1.method1(1);

        California c1 = new California();
        c1.hollyWood();
        c1.tax();
        c1.method1(91801);

        States s1 = new Kentucky();
        //s1.method1();
        s1.tax();

        States s2 = new California();
        s2.tax();
        //s2.ky(); Does not work because ky is in Kentucky, not States.
        // Super classes have no access created inside their sub classes.
        System.out.println("--------------------------------------");
        List<States> states = new ArrayList<>();
        states.add(new California());
        states.add(new Kentucky());
        for (States states1 : states){
            states1.tax();
            states1.method1();
            states1.taxRate();
        }
    }
}
