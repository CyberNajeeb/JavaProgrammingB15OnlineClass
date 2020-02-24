package office_hour;

public class Day28_ArraysPractice {

    public static void main(String[] args) {

        String[] names = {"John", "Kevin", "Scott"};
        System.out.println("First Name = " + names[0]);

        for (String name : names){
            System.out.println(name);

        }
        String[][] students = {
                {"1", "John", "35", "Boston"},
                {"2", "Kevin", "40"},
                {"3", "Scott", "20"}
        };
        System.out.println("How many arrays are inside students 2D array? " + students.length);
        System.out.println("How many in first row (inner array)? " + students[0].length);
        System.out.println("How many in second row (inner array)? " + students[1].length);
        System.out.println("How many in third row (inner array)? " + students[2].length);

        for (String[] arr : students){
            for (String value : arr){
                System.out.print(value + " ");
            }System.out.println();
        }

        for (String[] row : students){
            System.out.println(row[2]);


            int age = Integer.parseInt(row[2]);

        }

    }
}
