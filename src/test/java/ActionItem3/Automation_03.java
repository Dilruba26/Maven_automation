package ActionItem3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Automation_03 {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //define the webdriver i am going to use
        WebDriver driver = new ChromeDriver(options);

        //capture search number and print for following countries using arraylist and for loop
        ArrayList<String> Hobbies = new ArrayList<>();
        Hobbies.add("Cycling");
        Hobbies.add("Swimming");
        Hobbies.add("Gardening");
        Hobbies.add("Travelling");
        Hobbies.add("Drawing");
        for(int i = 0; i < Hobbies.size(); i++){
            //go to bing home page
            driver.navigate().to("https://www.bing.com");
            Thread.sleep(3000);
            //locate element for search field and type keyword 'Hobbies'
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Hobbies.get(i));
            //submit on bing search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
            Thread.sleep(2500);
            //capture the bing search and print it
            String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            //System.out.println("Result is " + searchResult);
            //extract out the number and print the search number only
            String[] arrayResult = searchResult.split(" ");
            //to replace ( and ) from the seconds that's coming from arrayList[3] use .replace command to replace it with ""(no space)
            String replaceParanth = arrayResult[3].replace("(","").replace(")","");
            System.out.println("My Favorite hobby " + Hobbies.get(i) + " is " + arrayResult[1]);
        }//end of for loop
        //quit the driver
        driver.quit();



    }//end of main method
}//end of java class
