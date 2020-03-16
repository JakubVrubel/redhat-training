package rhtraining.dummyWebsite;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TableTest {
    @Test
    public void tableTest(){
        open("https://demoqa.com");
        $(By.linkText("Automation practice table")).click();

        //assure that we test the correct table cell
        $(By.xpath("//*[@id=\"content\"]/div[2]/table/tbody/tr[3]/th")).shouldHave(text("Taipei 101"));
        $(By.xpath("//*[@id=\"content\"]/div[2]/table/thead/tr/th[5]")).shouldHave(text("Built"));

        //the cell contains desired text
        $(By.xpath("//*[@id=\"content\"]/div[2]/table/tbody/tr[3]/td[4]")).shouldHave(text("2004"));
    }
}
