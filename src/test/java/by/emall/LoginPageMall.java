package by.emall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageMall {
    private WebDriver driver;

    public LoginPageMall(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPageMall clickButton() {
        By by = By.xpath(LoginXpath.BUTTON_SIGN_IN_XPATH);
        WebElement element = driver.findElement(by);
        element.click();
        return this;
    }

    public LoginPageMall inputPassword() {
        By by = By.xpath(LoginXpath.INPUT_PASSWORD_XPATH);
        WebElement element = driver.findElement(by);
        element.sendKeys("fd#456a$AS");
        return this;
    }

    public LoginPageMall inputPhone() {
        By by = By.xpath(LoginXpath.INPUT_PHONE_XPATH);
        WebElement element = driver.findElement(by);
        element.sendKeys("298554234");
        return this;
    }

    public String textEmptyPhone() {
        By by = By.xpath(LoginMessage.EMPTY_PHONE_XPATH);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element.getText();
    }

    public String textEmptyPassword() {
        By by = By.xpath(LoginMessage.EMPTY_PASSWORD_XPATH);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element.getText();
    }

    public String textInvalidMessage() {
        By by = By.xpath(LoginMessage.INVALID_MESSAGE_XPATH);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return element.getText();
    }
}
