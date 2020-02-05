package day31;

public class CallingOneMethodInsideAnother {
    public static void main(String[] args) {

        allMethodsInThisClass();

    }

    public static void allMethodsInThisClass(){
        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeThemToSchool();
        goToWork();
        groceryShopping();
        studyJava();
        goToSleep();
        cooking();
        sayILoveJava300Times();
    }

    public static void wakeUp(){
        System.out.println("Open your eyes");
        System.out.println("Close your eyes");
        System.out.println("Hear the alarm, wake up again");
    }
    public static void drinkCoffee(){
        System.out.println("Put coffee in coffee machine");
        System.out.println("Press the button to start brewing");
    }
    public static void prepareKidsForSchool(){
        System.out.println("Tell the kids to wake up");
        System.out.println("Prepare breakfast for kids");
        System.out.println("Eat breakfast together");
    }
    public static void takeThemToSchool(){
        System.out.println("Take kids to school");
        System.out.println("Say goodbye");
    }
    public static void goToWork(){
        System.out.println("Suit up for work");
        System.out.println("Ask Alexa to request an Uber");
    }
    public static void groceryShopping(){

    }
    public static void cooking(){}
    public static void studyJava(){
        System.out.println("Think Java upon waking up");
        System.out.println("Sit down and start coding");
        System.out.println("========================================");
    }
    public static void sayILoveJava300Times(){
        for (int i = 1; i <= 300; i++) {
            System.out.println("I Love Java | ");

        }
    }
    public static void goToSleep (){}



}
