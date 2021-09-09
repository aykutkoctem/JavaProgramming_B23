package day53_Abstraction.WebDriverTask;

public class ChromeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("ChromeDriver navigating to : "+url);
    }

    @Override
    public void findElement(String locator) {

        System.out.println("Chromedriver-locating the element by "+locator);
    }

    @Override
    public void getTitle() {
        System.out.println("ChromeDriver-getting the title");
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver-quit");

    }

    @Override
    public void close() {
        System.out.println("ChromeDriver-closing the tab");

    }
}
