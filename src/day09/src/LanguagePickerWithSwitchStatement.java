package day09.src;

import java.util.Scanner;

public class LanguagePickerWithSwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String languageName = "";
        System.out.println("Please enter your choice of language!");
        int languageOption = sc.nextInt();
        switch (languageOption){
            case 1:
                languageName = "Hello, SDET";
                break;
            case 2:
            languageName = "Salam";
            break;
            case 3:
                languageName = "Hola";
                break;
            case 4:
                languageName = "Privet";
                break;
            case 5:
                languageName = "Merhaba";
                break;
            case 6:
                languageName = "Szia";
                break;
            case 7:
            languageName = "bonjour";
            default:
            languageName = "Unknown choice";
        }
        System.out.println(languageName + ", SDET!");
    }
}
