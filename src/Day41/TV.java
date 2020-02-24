package Day41;

public class TV {

    String brand, name;
    boolean isOn;
    int currentChannel;

    public int getCurrentChannel(){
        return currentChannel;
    }
    public void turnOn() {
        System.out.println("TV is now on!");
        if (isOn == false) {
            isOn = true;
        }
    }

    public void turnOff() {
        System.out.println("TV is now off!");
        if (isOn == true) {
            isOn = false;
        }


    }
    public void setCurrentChannel(int newChannel) {
        if (newChannel < 0 || newChannel > 50) {
            System.out.println("Invalid channel");
            return;
        }
            else if (isOn == true) {
                currentChannel = newChannel;
            } else {
                System.out.println("TV is off!");
            }
        }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}