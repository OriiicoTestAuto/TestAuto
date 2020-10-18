package modules;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //Pour chaque feature trouvé, vérifier si step definition est complet
        strict = true,
        //Config generer rapport de test
        plugin = {"pretty", "json:target/json/results.Json"},
        //chemin pour trouver le test
        features = {"src/test/ressources/features"},
        //chercher les steps definition à dérouler
        glue = {"modules","step_definition"}

)

public class TestRunner {
    //Contrôler les tests
}
