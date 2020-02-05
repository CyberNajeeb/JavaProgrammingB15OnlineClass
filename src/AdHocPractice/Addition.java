package AdHocPractice;

public class Addition {

    int x, y, result;

    public void setCalculator(int newX, int newY){
        x = newX;
        y = newY;
        result = newX+newY;
    }
    public int calculate(){

        return result;
    }
}

