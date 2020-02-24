package day35;

public class StringToIntParsing {
    public static void main(String[] args) {

        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);

        String empID = "FB-457";
        //int id = Integer.parseInt(empID.split("-")[1]);
        //System.out.println("id = " + id);

                //OR

        String[] empIDSplit = empID.split("-");
        String idStr = empIDSplit[1];
        int id = Integer.parseInt(idStr);
        System.out.println("id = " + id);

        String twoNumbers = "100,100";
        int sum = Integer.parseInt(twoNumbers.split(",")[0]) + Integer.parseInt(twoNumbers.split(",")[1]);
        System.out.println("twoNumbers = " + sum);

        String name = "006-007";
        int num1 = Integer.parseInt(name.split("-")[0]);
        int num2 = Integer.parseInt(name.split("-")[1]);
        System.out.println("num1 = " + num1 + num2);
    }
}
