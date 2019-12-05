package day08;

import javax.swing.*;

public class IfElseStatement {

    public static void main(String[] args) {

        int speedLimit = 60;

        int yourCurrentSpeed = 100;

        boolean IAmSpeeding = (yourCurrentSpeed > speedLimit);

        //if (IAmSpeeding) {
        //OR
        if (true) {
            System.out.println("You'll get cited!");

        } else {
            System.out.println("Go party.");
        }
        }
    }
