package ActionItem5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

//public class AI04 {
    //public static void main(String[] args) throws InterruptedException {

        //WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        //ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        //options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        //options.addArguments("start-maximized");
        //define the Web driver  I am going to use
        //WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator site
        //driver.navigate().to("https://www.weightwatchers.com/us/");
        //Thread.sleep(3000);

        //create arraylist for three different zipcodes
        //ArrayList<String> zipCodes = new ArrayList<>();
        //zipCodes.add("14225");
        //zipCodes.add("14228");
       // zipCodes.add("11423");

        //click on search button

        //using for loop for iterating through following steps
       // for (int i = 0; i < zipCodes.size(); i++) {

            //Click on  attend dropdown
           // try {
             //   driver.findElement(By.xpath("//*[text() = 'Attend']")).click();
            //} catch (Exception e) {
                //print out the exception
              //  System.out.println("unable to click the attend dropdown" + e);
            //}

            //click on the unlimited workshop
            //try {
              //  driver.findElement(By.xpath("//*[@data-e2e-name='unlimited_workshops']")).click();
            //} catch (Exception e) {
                //print out the exception
              //  System.out.println("unable to select the unlimited workshops" + e);
            //}
            //click on the studio button
            //try {
              //  driver.findElement(By.xpath("//span[text() = 'Studio']")).click();
            //} catch (Exception e) {
              //  System.out.println("unable to click studio" + e);
            //}

            //clear and type zipcodes
            //try {
              //  WebElement zipSearch = driver.findElement(By.xpath("//*[@id = 'location-search']"));
                //zipSearch.clear();
                //zipSearch.sendKeys(zipCodes.get(i));
            //} catch (Exception e) {
              //  System.out.println("unable to click on search field" + e);
            //}
            //click on search arrow
            //try {
              //  WebElement searchArrow = driver.findElement(By.xpath("//*[@id = 'location-search-cta']"));
                //searchArrow.click();
            //} catch (Exception e){
              //  System.out.println("unable to click on search arrow");
            //}

            //click on the studio link
            //try {
              //  ArrayList<WebElement> searchResults = new ArrayList<>(driver.findElements(By.id("//*[@class = 'linkContainer-1NkqM']")));
            //} catch (Exception e) {
              //  System.out.println("unable to click on the studio list" + e);
            //}
            // print out the studio address

            //try {
              //  String studioAddress = driver.findElement(By.xpath("//*[@id='location-1256159']")).getText();
                //System.out.println("My Studio Address is " + studioAddress);
            //} catch (Exception e) {
              //  System.out.println("unable to print studio address" + e);
            //}
            //scroll down to studio schedule
            //try {
              //  JavascriptExecutor jse = (JavascriptExecutor) driver;
                //jse.executeScript("scroll(0,400)");
            //} catch (Exception e) {
              //  System.out.println("unable to scroll down" + e);
            //}

            //print studio schedule table
            //try {
             //   String studioSchedule = driver.findElement(By.xpath("//*[class = 'scheduleContainerMobile-1RfmF']")).getText();
               // System.out.println("My Studio Schedule is " + studioSchedule);
            //} catch (Exception e) {
              //  System.out.println("unable to print studio schedule" + e);
            //}
        //}//end of for loop

        //quit chrome driver
        //driver.quit();

   // }//end of main
//}//end of java class
