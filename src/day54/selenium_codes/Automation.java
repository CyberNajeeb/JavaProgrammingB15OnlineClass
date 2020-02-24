package day54.selenium_codes;

public class Automation {

    public static void main(String[] args) {

        WebDriver c1 = new ChromeDriver();
        c1.openBrowser();
        c1.navigateTo("https://google.com");
        c1.maximise();
        c1.closeBrowser();

        System.out.println("-------------------------");

        c1 = new FireFoxDriver();
        c1.openBrowser();
        c1.navigateTo("https://firefox.com");
        c1.maximise();
        c1.closeBrowser();

        System.out.println("-------------------------");

        c1 = new SafariDriver();
        c1.openBrowser();
        c1.navigateTo("https://safari.com");
        c1.maximise();
        c1.closeBrowser();
    }
}
