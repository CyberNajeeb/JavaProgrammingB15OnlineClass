package day55;

public class TaxiAction{
        public static void main(String[] args) {

            Engine e1 = new Engine("V8", 550);
            Driver d1 = new Driver("Pedro", 456);
            Taxi t1 = new Taxi(123, e1, d1);
            System.out.println("t1 = " + t1);

            Taxi t2 = new Taxi(102,
                    new Engine("V8", 600),
                    new Driver("John", 12345));
            System.out.println("t2 = " + t2);

            System.out.println( d1.name + e1.horsePower);


        }
    }