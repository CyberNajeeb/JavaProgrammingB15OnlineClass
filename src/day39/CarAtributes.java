package day39;

public class CarAtributes {

    String make, model, color;
    int year;

    // instance methods are tied to the object
    // it does not have static keyword
    // we need an object when we call them
    public void goForward(){
        System.out.print("Going forward ");

    }
    public void printYear() {
        System.out.println("Car age is " + (2020 - year) + " years");
    }
    public void changeColorTo( String newColor){
        color = newColor;
    }
}
