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
        Assertions.assertEquals(LoginMessage.EXPECTED_EMPTY_FIELDS_XPATH, loginPage.textEmptyPhone());
    }

    @Test
    public void testOnlyPhone() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPageMall loginPage = new LoginPageMall(driver);
        loginPage.inputPhone().clickButton();
        Assertions.assertEquals(LoginMessage.EXPECTED_EMPTY_PASSWORD_XPATH, loginPage.textEmptyPassword());
    }

    @Test
    public void testOnlyPassword() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPageMall loginPage = new LoginPageMall(driver);
        loginPage.inputPassword().clickButton();
        Assertions.assertEquals(LoginMessage.EXPECTED_EMPTY_PHONE_XPATH, loginPage.textEmptyPhone());
    }

    @Test
    public void testUnregisteredUser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://emall.by/login/password");
        LoginPageMall loginPage = new LoginPageMall(driver);
        loginPage.inputPhone().inputPassword().clickButton();
        Assertions.assertEquals(LoginMessage.EXPECTED_INVALID_MESSAGE_XPATH, loginPage.textInvalidMessage());
    }
}
