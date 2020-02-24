package office_hour.officehour_02_06_20;

public abstract class States implements TheFed {
    //Class Zoo has a Has_A relationship with Animal class

    public abstract void tax();

    public final void method1(){
        System.out.println("Method 1 from states class");
    }
}
