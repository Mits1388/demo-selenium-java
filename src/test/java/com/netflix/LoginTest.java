package com.netflix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

public class LoginTest {

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButton();

        Assertions.assertEquals("Укажите действительный адрес электронной почты или номер телефона.", loginPage.textEmptyEmail());
    }


    }

    //one field is complete

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmail();
        loginPage.clickButton();

        Assertions.assertEquals("Пароль должен содержать от 4 до 60 символов.", loginPage.textEmptyPassword());
    }


    }

    //about the field filled in by an unregistered user

    @Test
    public void test3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputEmail();
        loginPage.inputPassword();
        loginPage.clickButton();

        Assertions.assertEquals("Неверный пароль для testA@test.com", loginPage.textInvalidMessage());

        String actual = loginPage.text();
        Assertions.assertEquals("Неверный пароль для testA@test.com", actual);

    }
}
