package AdHocPractice;

public class MileConversion {
    double mile;
    double km;

    public void calculateKm(double newKm){
        mile = newKm/1.609;
    }

    public double getMile(){
        return mile;
    }

    public void calculateMile(double newMile){
        km = newMile*1.609;
    }
    public double getKm(){
        return km;

    }

}
