package Day5_05072022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptions_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

    //setup your chromedriver with webdrivermanager
    WebDriverManager.chromedriver().setup();
    //set chrome options arguments
    ChromeOptions options = new ChromeOptions();
    //set the condition to incognito mode
    options.addArguments("incognito");
    //set the condition to maximize/fullscreen your driver
    options.addArguments("start-maximized");
    //setting your driver as headless (running on background)
    options.addArguments("headless");
    //define the webdriver i am going to use
    WebDriver driver = new ChromeDriver(options);
    //go to google home page
    driver.navigate().to("https://www.google.com");
      Thread.sleep(3000);
    //locate element for search field and type keyword 'cars'
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
    //submit on google search button
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        Thread.sleep(2500);
    //capture the google search and print it
    String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
    //System.out.println("Result is " + searchResult);
    //extract out the number and print the search number only
    String[] arrayResult = searchResult.split(" ");
    //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""(no space)
    String replaceParanth = arrayResult[3].replace("(","").replace(")","");
        System.out.println("My search number is " + arrayResult[1]);
    //quit the driver
        driver.quit();

}// end of main
}//end of java clas

