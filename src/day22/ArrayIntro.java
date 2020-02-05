package day22;

public class ArrayIntro {

    public static void main(String[] args) {

//        int num1 = 10;
//
//        int [] scores = new int[4];
//        scores [0] = 95;
//        scores [1] = 70;
//        scores [2] = 88;
//        scores [3] = 100;
//        System.out.println("scores = " + scores[0] + "\nscores = "
//                + scores[1] + "\nscores = " + scores[2]+ "\nscores = " + scores[3]);

        byte [ ] data = new byte[5];

        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        data[3] = 4;
        data[4] = 5;
        System.out.println("data = " + data[0]);
        System.out.println("data = " + data[1]);
        System.out.println("data = " + data[2]);
        System.out.println("data = " + data[3]);
        System.out.println("data = " + data[4]);

        System.out.println(data[0] + " " + data[1]+ " "+ data[2]+ " "+ data[3]+ " "+ data[4]);

    }
}
