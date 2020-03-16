package rhtraining;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelectMenuScenario {
    @Given("I have a {string} button and I click it")
    public void getButton(String button){
        open("https://demoqa.com");
        $(By.linkText("Selectmenu")).click();
        $(By.id(button)).click();
    }

    @When("I click {string}")
    public void clickOption(String option) {
        $$("[role=option]").findBy(text(option)).click();
    }

    @Then("{string} displays as text of the button in the field {string}")
    public void isItSelected(String option, String span) {
        $(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/form/fieldset/span["+span+"]/span[2]")).shouldHave(text(option));
    }
}
