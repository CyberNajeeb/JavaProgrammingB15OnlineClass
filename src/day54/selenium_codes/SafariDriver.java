package day54.selenium_codes;

public class SafariDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Going to open the browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to " + url + " using Safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser");
    }

    @Override
    public void maximise() {
        System.out.println("Web page maximised");
    }
}
