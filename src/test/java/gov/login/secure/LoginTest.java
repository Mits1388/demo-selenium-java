package gov.login.secure;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void test1() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");

        String singInXpath = "/html/body/main/div/nav/ul/li[1]/a";
        By singInBy = By.xpath(singInXpath);
        WebElement singInElement = driver.findElement(singInBy);
        singInElement.click();
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");

        String inputAddressXpath = "/html/body/main/div/form/lg-validated-field/div/input";
        By inputAddressBy = By.xpath(inputAddressXpath);
        WebElement inputAddressElement = driver.findElement(inputAddressBy);
        inputAddressElement.sendKeys("testA@test.com");

        String singInXpath = "/html/body/main/div/form/lg-submit-button/button";
        By singInBy = By.xpath(singInXpath);
        WebElement singInElement = driver.findElement(singInBy);
        singInElement.click();
    }

    @Test
    public void test3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");

        String inputPasswordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        By inputPasswordBy = By.xpath(inputPasswordXpath);
        WebElement inputPasswordElement = driver.findElement(inputPasswordBy);
        inputPasswordElement.sendKeys("1q2w#E4r");

        String singInXpath = "/html/body/main/div/form/lg-submit-button/button";
        By singInBy = By.xpath(singInXpath);
        WebElement singInElement = driver.findElement(singInBy);
        singInElement.click();
    }

    @Test
    public void test4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");

        String inputAddressXpath = "/html/body/main/div/form/lg-validated-field/div/input";
        By inputAddressBy = By.xpath(inputAddressXpath);
        WebElement inputAddressElement = driver.findElement(inputAddressBy);
        inputAddressElement.sendKeys("testB@test.com");

        String inputPasswordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        By inputPasswordBy = By.xpath(inputPasswordXpath);
        WebElement inputPasswordElement = driver.findElement(inputPasswordBy);
        inputPasswordElement.sendKeys("a1S@d3F$");

        String singInXpath = "/html/body/main/div/form/lg-submit-button/button";
        By singInBy = By.xpath(singInXpath);
        WebElement singInElement = driver.findElement(singInBy);
        singInElement.click();
    }
}
