package com.netflix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButton() {
        By buttonBy = By.xpath(LoginXpath.BUTTON_SIGN_IN_XPATH);
        WebElement buttonElement = driver.findElement(buttonBy);
        buttonElement.click();
    }

    public void inputEmail() {
        By emailBy = By.xpath(LoginXpath.INPUT_EMAIL_XPATH);
        WebElement emailElement = driver.findElement(emailBy);
        emailElement.sendKeys("testA@test.com");
    }

    public void inputPassword() {
        By passwordBy = By.xpath(LoginXpath.INPUT_PASSWORD_XPATH);
        WebElement passwordElement = driver.findElement(passwordBy);
        passwordElement.sendKeys("fd4@k$b&");
    }

    public String textEmptyEmail() {
        By textBy = By.xpath(LoginMessage.EMPTY_EMAIL_XPATH);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textElement = wait.until(ExpectedConditions.presenceOfElementLocated(textBy));
        return textElement.getText();
    }

    public String textEmptyPassword() {
        By textBy = By.xpath(LoginMessage.EMPTY_PASSWORD_XPATH);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textElement = wait.until(ExpectedConditions.presenceOfElementLocated(textBy));
        return textElement.getText();
    }

    public String textInvalidMessage() {
        By textBy = By.xpath(LoginMessage.INVALID_MESSAGE_XPATH);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textElement = wait.until(ExpectedConditions.presenceOfElementLocated(textBy));
        return textElement.getText();
    }
}
