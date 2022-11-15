import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.time.Duration;

public class MultiBrowserTest{

    static String broser = "chrome";
    static String baseurl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        //1) Setup
        if (broser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if (broser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (broser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();

        }
        else{
            System.out.println("Wrong Browser name");
        }
        //2) Launch Url
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3) Print the title of the page
        System.out.println("Title  of the page is " + driver.getTitle());

        //4)Print the current url
        System.out.println("Current url is " + driver.getCurrentUrl());

        //5) print the page source
        System.out.println(" Page source is " + driver.getPageSource());

        //6) Find and enter email field
        WebElement email = driver.findElement(By.name(("username")));
        email.sendKeys("manish123");

        //7) Find and enter password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("scrum2022");

        //8) Close the browser
        driver.quit();




    }
}

