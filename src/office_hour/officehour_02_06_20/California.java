package office_hour.officehour_02_06_20;

public class California extends States {
    String statesName = "California";
    @Override
    public void tax() {
        System.out.println("CA's tax rate is 9%");
    }
    public void hollyWood(){
        System.out.println("Only CA has Hollywood");
    }
    public final void method1(int zip){
        System.out.println("Method 1 from states class in CA");
    }

    @Override
    public void taxRate() {
        System.out.println("CA's tax rate is 9%");
    }
}
