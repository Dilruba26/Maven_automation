package day8_052122;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class classActionItem_01 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //define the Web driver  I am going to use
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator site
        driver.navigate().to("https://www.hotels.com");
        Thread.sleep(3000);

        //create arraylist for three different destination
        ArrayList<String> location = new ArrayList<>();
        location.add("Miami");
        location.add("California City");
        location.add("New York");

        ArrayList<String> checkIn = new ArrayList<>();
        checkIn.add("June 8, 2022");
        checkIn.add("June 12, 2022");
        checkIn.add("June 16, 2022");

        ArrayList<String> checkOut = new ArrayList<>();
        checkOut.add("June 10, 2022");
        checkOut.add("June 15, 2022");
        checkOut.add("June 18, 2022");


        //click on search button
        //using for loop for iterating through following steps
       for (int i = 0; i < location.size(); i++) {
            driver.findElement(By.xpath("//*[@aria-label='Going to']"));

            //clear type where we wre going to
           WebElement destination = driver.findElement(By.xpath("//*[@id='location-field-destination']"));
           Thread.sleep(2000);
            destination.clear();
            destination.click();
            destination.sendKeys(location.get(i));
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@aria-label='CheckIN.get(i)+']")).click();
        }

}//end of main
}//end of java class
