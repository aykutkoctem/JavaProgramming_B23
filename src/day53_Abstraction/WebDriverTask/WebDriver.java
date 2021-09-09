package day53_Abstraction.WebDriverTask;

public interface WebDriver {
     void get(String url);

    void findElement(String locator);
    void  getTitle();
    void quit();
    void close();
}
/*
WebDriver task:

	1. Create an interface named WebDriver
			abstract methods:
				get(String url);
				findElement(String locator);
				getTitle();
				quit();
 */