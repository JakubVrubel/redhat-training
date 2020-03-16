package rhtraining.dummyWebsite;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class selectMenuTest {
    public void testButton(String button, String option, String span){
        open("https://demoqa.com");
        $(By.linkText("Selectmenu")).click();
        $(By.id(button)).click();
        $$("[role=option]").findBy(text(option)).click();
        $(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/form/fieldset/span["+span+"]/span[2]")).shouldHave(text(option));
    }

    @Test
    public void speedSelectMenuTest() {
        testButton("speed-button","Slower","1");
        testButton("speed-button","Faster","1");

    }
    @Test
    public void filesSelectMenuTest() {
        testButton("files-button","ui.jQuery.js","2");
        testButton("files-button","Some unknown file","2");
    }
    @Test
    public void numberSelectMenuTest() {
        testButton("number-button","6","3");
        testButton("number-button","19","3");
    }
    @Test
    public void salutationSelectMenuTest(){
        testButton("salutation-button","Mrs.","4");
        testButton("salutation-button","Other","4");
    }
}
