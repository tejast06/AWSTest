package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

    String path = System.getProperty("user.dir");
    

    
    public static void initialization() {


    	ChromeOptions option = new ChromeOptions();
    	option.setHeadless(true);

        //
        ///usr/bin/chromedriver

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\impac\\Desktop\\selenium\\chromedriver.exe");
        driver = new ChromeDriver(option);
    	
        driver.manage().window().maximize();
        driver.get("https://www.guru99.com/software-testing.html");
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }

}
