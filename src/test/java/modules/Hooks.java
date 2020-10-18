package modules;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page_objects.GoogleSearchPage;

import java.util.concurrent.TimeUnit;

import static utils.BrowserFactory.getFactoryDriver;

public class Hooks {
    public static WebDriver driver;
    private GoogleSearchPage googleSearchPageObject = new GoogleSearchPage();

    @Before
    public void setUp(){
        driver = getFactoryDriver();
        PageFactory.initElements(driver, googleSearchPageObject);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}//END.
