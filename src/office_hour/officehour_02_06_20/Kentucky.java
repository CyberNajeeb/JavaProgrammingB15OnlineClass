package office_hour.officehour_02_06_20;

public class Kentucky extends States {
    String statesName = "Kentucky";
    // Tiger has an IS-A relationship with Animal class
    @Override
    public void tax() {
        System.out.println("Kentucky's tax rate is 6%");
    }
public void ky(){
    System.out.println("KY does KFC");
}
    public final void method1(int zip){
        System.out.println("Method 1 from states class in ky");
    }

    @Override
    public void taxRate() {
        System.out.println("KY's tax rate is 6%");
    }
}
