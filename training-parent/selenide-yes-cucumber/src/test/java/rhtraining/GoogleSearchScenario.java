package rhtraining;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchScenario{
    @Given("I have opened google")
    public void openGoogle() {
        open("https://google.com");
    }

    @When("I search {string}")
    public void performGoogleSearch(String keyword) {
        $(By.name("q")).setValue(keyword).pressEnter();
    }

    @Then("{string} appears in the first result")
    public void appearsInTheFirstResult(String keyword) {
        $("#res .g").shouldHave(text(keyword));
    }
}
