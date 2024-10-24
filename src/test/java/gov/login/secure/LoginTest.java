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
        String singInXpath = "//*[@id=\"main-content\"]/div/nav/ul/li[1]/a";
        By singInBy = By.xpath(singInXpath);
        WebElement singInElement = driver.findElement(singInBy);
        singInElement.click();
    }

}
