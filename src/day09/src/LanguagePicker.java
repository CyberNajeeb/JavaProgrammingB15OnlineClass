package day09.src;

import java.util.Scanner;

public class LanguagePicker {

    public static void main(String[] args) {
        String languageName = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your choice of languageOption!");
        int languageOption = sc.nextInt();
        if (languageOption==1) {
            languageName = "Hello, SDET";
        }else if (languageOption==2) {
            languageName = "Salam";
        }else if (languageOption==3) {
            languageName = "Hola";
        }else if (languageOption==4) {
            languageName = "Privet";
        }else if (languageOption==5) {
            languageName = "Merhaba";
        }else if (languageOption==6) {
            languageName = "Szia";
        }else if (languageOption==7) {
            languageName = "bonjour";
        }else {
            languageName = "Unknown choice";
        }
        System.out.println(languageName + ", SDET");
    }
}
