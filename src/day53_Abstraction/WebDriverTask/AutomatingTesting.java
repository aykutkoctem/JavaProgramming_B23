package day53_Abstraction.WebDriverTask;

import day47_Recap.browsersTask.Opera;

public class AutomatingTesting {

    public static void main(String[] args) {
       ChromeDriver driver= new ChromeDriver();
       driver.get("www.google.com");
       driver.findElement("xpath");
       driver.getTitle();
       driver.close();
       driver.quit();

        System.out.println("-----------------------------------------------------------");

        FireFoxDriver driver2=new FireFoxDriver();
        driver2.get("www.google.com");
        driver2.findElement("xpath");
        driver2.getTitle();
        driver2.close();
        driver2.quit();

        System.out.println("-----------------------------------------------------------");

        OperaDriver driver3=new OperaDriver();
        driver3.get("www.google.com");
        driver3.findElement("xpath");
        driver3.getTitle();
        driver3.close();
        driver3.quit();


        System.out.println("-------------------------------------------------------------");

        EdgeDriver driver4 = new EdgeDriver();
        driver4.get("www.google.com");
        driver4.findElement("xpath");
        driver4.getTitle();
        driver4.close();
        driver4.quit();
        System.out.println("-------------------------------------------------------------");

        WebDriver driver5=new FireFoxDriver();
        driver5.get("www.amazon.com");

        System.out.println("--------------------------------------");

        WebDriver driver6 = getDriver("firefox");

        //   WebDriver driver7 = new ChromeDriver();


    }


    public static WebDriver getDriver(String name){

        switch (name){
            case "chrome":
                return new ChromeDriver();

            case "firefox":
                return new FireFoxDriver();

            default:
                throw new RuntimeException("Invalid Browser name");
        }


    }



}