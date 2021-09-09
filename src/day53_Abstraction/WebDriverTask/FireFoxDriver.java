package day53_Abstraction.WebDriverTask;

public class FireFoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver navigating to : "+url);

    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver-locating the element by "+locator);

    }

    @Override
    public void getTitle() {
        System.out.println("FirefoxDriver-getting the title");

    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver-quit");

    }

    @Override
    public void close() {
        System.out.println("FirefoxDriver-closing the tab");

    }
}
