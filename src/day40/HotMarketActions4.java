package day40;

public class HotMarketActions4 {

    public static void main(String[] args) {

        Offers o1 = new Offers();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = false;
        o1.salary = 140000;

        //String o1String = o1.toString();
        System.out.println(o1.toString());

        o1.displaySalaryInformation();
        o1.turnToFullTime();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displaySalaryInformation();

        o1.changeAllInfo("Seattle",
                "Amazon", 150000, true);
        o1.displaySalaryInformation();


        // if this guy earn more than 100K
        // move him to Atlanta
        System.out.println("Is it 100K offer ? " + o1.is100KOffer());
//        boolean result = o1.is100KOffer();
//        if(result==true){
        if (o1.is100KOffer()) {
            o1.changeLocation("Atlanta");
        }
        o1.displaySalaryInformation();
    }


}