package day16;

public class IndexOfWith2Parametera {

    public static void main(String[] args) {

        String name = "I Love Java I Love Java Java Java";

        System.out.println("Starting from 0: " + name.indexOf("Java"));
        System.out.println("Starting from 7: " + name.indexOf("Java" , 7));
        System.out.println("Starting from 8: " + name.indexOf("Java" , 8));

        System.out.println("Starting from 20: " + name.indexOf("Java" , 20));

        int firstJavaLocation = name.indexOf("Java"); // will show the location of first "Java" substring in the sentence/String
        int startingPointToSearchSecondJava = firstJavaLocation + 1;
        int secondJavaLocation = name.indexOf("Java" , startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation + 1);
        System.out.println("Second word in this sentence is " + name.substring(firstSpaceLocation + 1, secondSpace));;
    }
}
