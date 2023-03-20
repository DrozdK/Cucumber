package helpers;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class CatalogHelper {

    public static List<String> getItems(String el){
        ElementsCollection items = Selenide.$$x("//a[text()='"+el+"']/../..//div[contains(@class, 'grid')]//span[contains(@class, 'sign')]");
        List<String> list = new ArrayList<>();
        items.forEach(x -> list.add(x.getOwnText()));
        return list;
    }

    public static void hoverTo(SelenideElement sEl) {
        actions().moveToElement(sEl).perform();
    }

    public static SelenideElement getElement(String name) {
        return $x("//span[contains(@class,'main') and text()='"+name+"']");
    }
}
