package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;

public class BrowserFactory {
    static WebDriver factoryDriver;
    private static HashMap<String, String> configurationMap = PropertiesFile.read("src/test/ressources/environnement/config.properties");

    //permet de faire appel à la clé browser dans fichier config.properties
    static String webBrowserType = configurationMap.get("browser");

    public static WebDriver getFactoryDriver(){
        String driverPath = "src/test/ressources/drivers/";
        switch (webBrowserType){
            //Chrome
            case "chrome":
                System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
                factoryDriver = new ChromeDriver();
                break;
            //Firefox
            case "firefox":
                System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
                factoryDriver = new FirefoxDriver();
                break;
            default:
                break;
        }
        return factoryDriver;
    }

}//END.
