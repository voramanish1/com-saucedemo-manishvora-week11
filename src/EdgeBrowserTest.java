import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String url = "https://www.saucedemo.com/";

        //Set Edge driver path
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Start Edge browser
        WebDriver driver = new EdgeDriver();

        //open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());

        //Get web element or page source
        System.out.println("Page source is : " + driver.getPageSource());

        //Find and enter email in email field element
        WebElement emailField = driver.findElement(By.name("user-name"));
        emailField.sendKeys("Admin");

       //Find and enter password in password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //Close browser
        driver.quit();




    }
}
