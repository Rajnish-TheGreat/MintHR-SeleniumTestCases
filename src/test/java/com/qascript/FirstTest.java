package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
       WebDriver driver = null;
      //  WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//         options.addArguments("start-maximized"); // open Browser in maximized mode
//         options.addArguments("disable-infobars"); // disabling infobars
//         options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("headless");
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security mode
        
         System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        driver = new ChromeDriver(options);
        driver.get("https://staging.dx0oqxblmo7a7.amplifyapp.com/login");
        System.out.println("Title of the page is: " + driver.getTitle());
 
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Mint HR"));
        driver.close();
    }


}
