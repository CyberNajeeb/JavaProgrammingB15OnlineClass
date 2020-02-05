package officeHours;

public class day30_12_18_Review {
    public static void main(String[] args) {
        String employee = "Najeeb Sohrabi [Senior Developer] nsohrabi0@g.co";

        int namestartingIndex = employee.indexOf(0)+1;
        int nameendingIndex = employee.indexOf("[")-1;
        String fullName = employee.substring(namestartingIndex,nameendingIndex);
        System.out.println("FullName = " + fullName);

        int startingIndex = employee.indexOf("[")+1;
        int endingIndex = employee.indexOf("]");

        String title = employee.substring(startingIndex,endingIndex);
        System.out.println("Title = " + title);

        String fullNameWithDash = fullName.replace(" ", "-");
        System.out.println("fullNameWithDash = " + fullNameWithDash);

        System.out.println(fullName.substring(0,1)+fullName.charAt(fullName.lastIndexOf(" ")+1)+" --> "+title);

        /*  TASK 1. Print all job titles - hint ( substring, indexOf)

            TASK 2: Print all FirstName-lastName jobTitle
       for example :
            Philipa-Salthouse Electrical Engineer
            Ulrika-Goolding Nuclear Power Engineer
        */

        if (title.equals("Senior Programmer")){

            System.out.println("PASS: Verified");

        }else {
            System.out.println("FAILED: Not verified!\nCurrent Title = " + title);
        }

    }
}
