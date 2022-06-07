package Day4_050622;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchtest {
    public static void main(String[] args) {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver();

        //go to google home page
        driver.navigate().to("https://www.google.com");
        //maximize the driver
        driver.manage().window().maximize();

        //quit the driver
        //driver.quit();


    }//end of java class

    }//end of main
