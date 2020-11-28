package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class Test02 extends Test {

    public static void changeLocation(WebDriver webDriver, String URL, String city_name) throws InterruptedException {
        webDriver.get(URL);
        WebDriverWait wait = new WebDriverWait(webDriver,60);
        pageLoadCheck(webDriver);
        clickElement(FindByXPath(webDriver, "//*[@id=\"__ozon\"]/div/div[1]/div[1]/div/div"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(), 'Выберите город')]")));
        WebElement element = FindByXPath(webDriver, "//*[@id=\"__ozon\"]/div/div[2]/div/div/div/div/div/label/div/input");
        enterData(element, city_name);
        Thread.sleep(1000);
        element.sendKeys(Keys.ENTER);
    }

    public static void pageLoadCheck(WebDriver webDriver) {
        String actualTitle = webDriver.getTitle();
        if (actualTitle.contentEquals("OZON — интернет-магазин. Миллионы товаров по выгодным ценам")) {
            System.out.println("Страница загружена");
        } else {
            System.out.println("Страница не загружена");
            System.exit(1);
        }
    }
}

