package tasks;

public class Task_1String {

    public static void main(String[] args) {
        String name = "Naj";

        if (name.length()>2){
            System.out.println(name.substring(0,2));

        }else if (name.isEmpty()){
            System.out.println("Empty");

        }else {
            System.out.println(name.substring(0,1) + (name.substring(0,1)));
        }
        }
    }
