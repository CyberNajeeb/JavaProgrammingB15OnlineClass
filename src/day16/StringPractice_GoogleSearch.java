package day16;

import java.util.Scanner;

public class StringPractice_GoogleSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the keyword to search");

        String keyWordToSearch = sc.nextLine();

        String tabTitle = keyWordToSearch + " - Google Search";

        if (tabTitle.startsWith(keyWordToSearch) && tabTitle.endsWith(" - Google Search")) {
            System.out.println("Test Passed");

        }else {
            System.out.println("Test Failed");
        }
    }
}
