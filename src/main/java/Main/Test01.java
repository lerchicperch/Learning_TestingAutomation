package Main;

import org.openqa.selenium.WebDriver;

public class Test01 extends Test {

    public static void searchProduct (WebDriver webDriver, String URL, String product_name) throws InterruptedException {
        webDriver.get(URL);
        pageLoadCheck(webDriver);
        enterData(FindByName(webDriver, "search"), product_name);
        clickElement(FindByXPath(webDriver, "//*[@id=\"__ozon\"]/div/div[1]/header/div[1]/div[3]/div/form/div[3]/div/button/div"));
    }

    public static void pageLoadCheck (WebDriver webDriver)
    {
        String actualTitle = webDriver.getTitle();
        if (actualTitle.contentEquals("OZON — интернет-магазин. Миллионы товаров по выгодным ценам"))
        {
            System.out.println("Страница загружена");
        }
        else
        {
            System.out.println("Страница не загружена");
            System.exit(1);
        }
    }
}

