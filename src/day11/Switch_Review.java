package day11;

import java.util.Scanner;

public class Switch_Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String switchOption = sc.next();

            switch (switchOption) {
                case "bd":
                    switchOption = "Bedroom Light";
                    break;
                case "Lr":
                    switchOption = "LivingRoom Lights";
                    break;
                default:
                    System.out.println("Can't find " + switchOption);

            }
            System.out.println(switchOption + "!");

        }
    }
