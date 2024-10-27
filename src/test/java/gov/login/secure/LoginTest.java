package gov.login.secure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest {

    @Test
    public void test1() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");

        String singInXpath = "/html/body/main/div/form/lg-captcha-submit-button/lg-spinner-button/button";
        By singInBy = By.xpath(singInXpath);
        WebElement singInElement = driver.findElement(singInBy);
        singInElement.click();

        String emptyPasswordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/div";
        By textBy = By.xpath(emptyPasswordXpath);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textElement = wait.until(ExpectedConditions.presenceOfElementLocated(textBy));
        Assertions.assertEquals("This field is required", textElement.getText());
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");

        String inputAddressXpath = "/html/body/main/div/form/lg-validated-field/div/input";
        By inputAddressBy = By.xpath(inputAddressXpath);
        WebElement inputAddressElement = driver.findElement(inputAddressBy);
        inputAddressElement.sendKeys("testA@test.com");

        String singInXpath = "/html/body/main/div/form/lg-captcha-submit-button/lg-spinner-button/button";
        By singInBy = By.xpath(singInXpath);
        WebElement singInElement = driver.findElement(singInBy);
        singInElement.click();

        String emptyPasswordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/div";
        By textBy = By.xpath(emptyPasswordXpath);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textElement = wait.until(ExpectedConditions.presenceOfElementLocated(textBy));
        Assertions.assertEquals("This field is required", textElement.getText());
    }

    @Test
    public void test3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://secure.login.gov/");

        String inputPasswordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        By inputPasswordBy = By.xpath(inputPasswordXpath);
        WebElement inputPasswordElement = driver.findElement(inputPasswordBy);
        inputPasswordElement.sendKeys("1q2w#E4r");

        String singInXpath = "/html/body/main/div/form/lg-captcha-submit-button/lg-spinner-button/button";
        By singInBy = By.xpath(singInXpath);
        WebElement singInElement = driver.findElement(singInBy);
        singInElement.click();

        String emptyEmailXpath = "/html/body/main/div/form/lg-validated-field/div/div";
        By textBy = By.xpath(emptyEmailXpath);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textElement = wait.until(ExpectedConditions.presenceOfElementLocated(textBy));
        Assertions.assertEquals("This field is required", textElement.getText());
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

        String singInXpath = "/html/body/main/div/form/lg-captcha-submit-button/lg-spinner-button/button";
        By singInBy = By.xpath(singInXpath);
        WebElement singInElement = driver.findElement(singInBy);
        singInElement.click();

        String invalidTextXpath = "/html/body/main/div/div[1]/div/p";
        By textBy = By.xpath(invalidTextXpath);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textElement = wait.until(ExpectedConditions.presenceOfElementLocated(textBy));
        Assertions.assertEquals("The email or password you’ve entered is wrong. Try resetting your password.", textElement.getText());
    }
}
