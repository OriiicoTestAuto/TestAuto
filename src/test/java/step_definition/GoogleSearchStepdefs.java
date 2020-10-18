package step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static modules.Hooks.driver;
import static junit.framework.TestCase.assertTrue;
import static page_objects.GoogleSearchPage.searchFor;

public class GoogleSearchStepdefs {

    @Given("I open google search page")
    public void iOpenGoogleSearchPage() {
        driver.get("https://www.google.com/");
    }

    @When("I lookup the word {string}")
    public void iLookupTheWord(String arg0) {
        // Appel la méthode qui fera appel à l'objet
        searchFor(arg0);
    }

    @Then("search results display the word {string}")
    public void searchResultsDisplayTheWord(String arg0) {
        //vérifier dans le titre de la page que l'argument recherché est bien présent
        assertTrue(driver.getTitle().contains(arg0));
    }

}//END.
