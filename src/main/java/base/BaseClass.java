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
    public static Properties prop;
    String path = System.getProperty("user.dir");
    
    public BaseClass() throws IOException, IOException {
        prop = new Properties();
        FileInputStream ip = new FileInputStream(path+"\\src\\main\\java\\config\\config.properties");
        prop.load(ip);
    }
    
    public static void initialization() {


    	ChromeOptions option = new ChromeOptions();
    	option.setHeadless(true);

    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(option);
    	
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   }

}
