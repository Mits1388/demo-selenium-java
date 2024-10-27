package by.emall;

import com.netflix.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void testEmptyFields(){

    }

    @Test
    public void testOnlyPhone() {

    }

    @Test
    public void testOnlyPassword(){

    }

    @Test
    public void testUnregisteredUser(){

    }


    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/login");
        com.netflix.LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButton();
        Assertions.assertEquals("Укажите действительный адрес электронной почты или номер телефона.", loginPage.textEmptyEmail());
    }



}
