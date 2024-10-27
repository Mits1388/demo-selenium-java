package by.emall;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void testEmptyFields() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPageMall loginPage = new LoginPageMall(driver);
        loginPage.clickButton();
        Assertions.assertEquals("Поле \"Номер телефона\" обязательно для заполнения.\n" +
                "Поле \"Пароль\" обязательно для заполнения.", loginPage.textEmptyPhone());
    }

    @Test
    public void testOnlyPhone() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPageMall loginPage = new LoginPageMall(driver);
        loginPage.inputPhone();
        loginPage.clickButton();
        Assertions.assertEquals("Поле \"Пароль\" обязательно для заполнения.", loginPage.textEmptyPassword());
    }

    @Test
    public void testOnlyPassword() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPageMall loginPage = new LoginPageMall(driver);
        loginPage.inputPassword();
        loginPage.clickButton();
        Assertions.assertEquals("Поле \"Номер телефона\" обязательно для заполнения.", loginPage.textEmptyPhone());
    }

    @Test
    public void testUnregisteredUser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPageMall loginPage = new LoginPageMall(driver);
        loginPage.inputPhone();
        loginPage.inputPassword();
        loginPage.clickButton();
        Assertions.assertEquals("Неверный логин или пароль", loginPage.textInvalidMessage());
    }
}
