package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testBase {

    //initializing the property file reading
    public static Properties CONFIG=null;
    public static Properties OR=null;
    public static WebDriver driver=null;

    public void initialize() throws IOException{
        if(driver == null){

            //config property file

            CONFIG= new Properties();
            FileInputStream fn =new FileInputStream(System.getProperty("/Users/eliasalao/IdeaProjects/Mendeley/src/main/java/config/config.properties"));
            CONFIG.load(fn);



            //Initialize the webdriver and EventFiringWebDriver
            if (CONFIG.getProperty("browser").equals("firefox")){
                driver = new FirefoxDriver();

            }else if(CONFIG.getProperty("browser").equals("IE")){
                //WebDriver driver = new InternetExplorerDriver();
                driver = new InternetExplorerDriver();

            }

            else if(CONFIG.getProperty("browser").equals("chrome")){
                driver = new ChromeDriver();
            }

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }


}
