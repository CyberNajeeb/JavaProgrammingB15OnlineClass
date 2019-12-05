package day12;

import java.util.Scanner;

public class WakeUpCodeInWeather {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("How's the weather");
        String weather = sc.next();

        if (weather.equalsIgnoreCase("Sunny")) {
            System.out.println("Happy coding in " + weather + " weather");
        }else if (weather.equalsIgnoreCase("Rainy")) {
            System.out.println("Coding in " + weather + " weather");
        }else if (weather.equalsIgnoreCase("Cloudy")) {
            System.out.println("Code in the " + weather + " cloud");
        }else {
            System.out.println("Rain or shine, Keep coding");
        }
    }
}
