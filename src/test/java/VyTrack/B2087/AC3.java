package com.cybertek.tests.Self_Practice.VyTrack.src.test.java.VyTrack.B2087;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AC3 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        //open chrome browser
        // go to "https://qa2.vytrack.com/user/login"
        driver.get("https://qa2.vytrack.com/user/login");
    }



    @Test
    public void odometer() throws InterruptedException {

        // find the element of username and password

        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("user160");
        Thread.sleep(3000);


        WebElement passWord = driver.findElement(By.id("prependedInput2"));
        passWord.sendKeys("UserUser123" + Keys.ENTER);
        Thread.sleep(300);

        // Clicks on Fleet module

        WebElement fleetElement = driver.findElement(By.cssSelector("span[class='title title-level-1']"));
        fleetElement.click();
        Thread.sleep(3000);


        WebElement vehicleOdometerElement = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
        vehicleOdometerElement.click();
        Thread.sleep(4000);

        // gets the "create vehicle odometer element and clicks on it"

        WebElement createVehicleOdometerElement = driver.findElement(By.xpath("//a[@title ='Create Vehicle Odometer']"));
        createVehicleOdometerElement.click();
        Thread.sleep(4000);


        // gets and clicks on cancel button on create odometer page

        WebElement cancelButton = driver.findElement(By.xpath("//a[@title='Cancel']"));
        cancelButton.click();


    }


}


