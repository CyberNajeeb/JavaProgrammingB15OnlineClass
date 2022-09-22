package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        byte [ ] data = new byte[5];

        data[0] = 1;
        data[1] = 2;
        data[2] = 3;
        data[3] = 4;
        data[4] = 5;
//        System.out.println("data = " + data[0]);
//        System.out.println("data = " + data[1]);
//        System.out.println("data = " + data[2]);
//        System.out.println("data = " + data[3]);
//        System.out.println("data = " + data[4]);
//
//        System.out.println(data[0] + " " + data[1]+ " "+ data[2]+ " "+ data[3]+ " "+ data[4]);
        for (int num: data  ) {
            System.out.println("data = " + num);
//            System.out.print(num + " ");
        }

    }
}
