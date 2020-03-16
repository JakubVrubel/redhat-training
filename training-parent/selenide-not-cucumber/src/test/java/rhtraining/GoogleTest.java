package rhtraining;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {
    @Test
    public void userCanSearch() {
        open("https://google.com");
        $(By.name("q")).setValue("Facebook").pressEnter();
        $("#res .g").shouldHave(text("Facebook – přihlaste se, nebo se zaregistrujte\n"));
    }
}