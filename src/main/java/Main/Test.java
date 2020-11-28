package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

    public static WebElement FindByID (WebDriver webDriver, String element_ID)
    {
        WebElement element = null;
        try
        {
            element = webDriver.findElement(By.id(element_ID));
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Элемент с ID " + element_ID + " не найден");
            System.exit(1);
        }
        return element;
    }

    public static WebElement FindByName (WebDriver webDriver, String element_name)
    {
        WebElement element = null;
        try
        {
            element = webDriver.findElement(By.name(element_name));
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Элемент с именем " + element_name + " не найден");
            System.exit(1);
        }
        return element;
    }

    public static WebElement FindByXPath (WebDriver webDriver, String element_XPath)
    {
        WebElement element = null;
        try
        {
            element = webDriver.findElement(By.xpath(element_XPath));
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Элемент с XPath " + element_XPath + " не найден");
            System.exit(1);
        }
        return element;
    }

    public static WebElement FindByClassName (WebDriver webDriver, String element_ClassName)
    {
        WebElement element = null;
        try
        {
            element = webDriver.findElement(By.xpath(element_ClassName));
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Элемент с классом " + element_ClassName + " не найден");
            System.exit(1);
        }
        return element;
    }

    public static void enterData (WebElement element, String data)
    {
        element.sendKeys(data);
        System.out.println("Данные '" + data + "' введены");
    }

    public static void clickElement (WebElement element)
    {
        element.click();
    }

}