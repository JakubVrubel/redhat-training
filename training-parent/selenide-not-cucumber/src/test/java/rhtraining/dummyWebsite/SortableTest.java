package rhtraining.dummyWebsite;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.*;

public class SortableTest {
    @Test
    public void listIsSorted(){
        open("https://demoqa.com");
        $(By.linkText("Sortable")).click();
        $$(".ui-sortable-handle").shouldHave(texts("Item 1","Item 2","Item 3","Item 4","Item 5","Item 6","Item 7"));
    }
}