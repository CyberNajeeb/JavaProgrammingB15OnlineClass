package day19;

public class ForLoop_Staircase {
    public static void main(String[] args) {
        String star = " * ";

        for (int i = 10; i>=-10; --i){

            System.out.println(star);
            star+=" * ";
        }
    }
}
