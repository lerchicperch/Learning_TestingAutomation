package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {

    public static final String URL = "https://www.ozon.ru/";
    public static final String TEST01DATA = "Маска шрека";
    public static final String TEST02DATA = "Санкт-Петербург";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver webDriver01 = new ChromeDriver();
        WebDriver webDriver02 = new ChromeDriver();

        Test01.searchProduct(webDriver01, URL, TEST01DATA);
        Thread.sleep(5000);
        webDriver01.quit();

        Test02.changeLocation(webDriver02, URL, TEST02DATA);
        Thread.sleep(5000);
        webDriver02.quit();
    }
}
