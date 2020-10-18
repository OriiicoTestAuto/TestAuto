package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class GoogleSearchPage {

    @FindBy(name = "q")
    private static WebElement searchbar;

    @FindBy(name = "btnK")
    private static WebElement searchButton;

    //Méthode pour exécuter la recherche google
    public static void searchFor(String keyword){
        searchbar.clear();
        searchbar.sendKeys(keyword);
        searchButton.click();
    }

}//END.
