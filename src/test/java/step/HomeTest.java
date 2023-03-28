package step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static helpers.CatalogHelper.*;

public class HomeTest {

    private final String home = "Дома и квартиры";

    @When("Наводим на пункт дома и квартиры")
    public void hoverToTheHomeButton() {
        hoverTo(getElement(home));
    }

    @Then("Проверяем что в подменю есть все пункты")
    public void check() {
        //given
        String sell = "Продажа";
        String arenda = "Аренда";
        List<String> homeItems = new ArrayList<>();
        homeItems.add("Минск");
        homeItems.add("Брест");
        homeItems.add("Витебск");
        homeItems.add("Гомель");
        homeItems.add("Гродно");
        homeItems.add("Могилев");
        homeItems.add("1-комнатные");
        homeItems.add("2-комнатные");
        homeItems.add("3-комнатные");
        homeItems.add("4+-комнатные");
        homeItems.add("До 30 000 $");
        homeItems.add("30 000–80 000 $");
        homeItems.add("От 80 000 $");

        List<String> arendaItems = new ArrayList<>();
        arendaItems.add("Минск");
        arendaItems.add("Брест");
        arendaItems.add("Витебск");
        arendaItems.add("Гомель");
        arendaItems.add("Гродно");
        arendaItems.add("Могилев");
        arendaItems.add("1-комнатные");
        arendaItems.add("2-комнатные");
        arendaItems.add("3-комнатные");
        arendaItems.add("4+-комнатные");
        arendaItems.add("Комнаты");
        arendaItems.add("От собственника");
        arendaItems.add("До 250 $");
        arendaItems.add("250-500 $");
        arendaItems.add("От 500 $");

        //then
        Assertions.assertThat(getItems(sell).containsAll(homeItems)).isTrue();
        Assertions.assertThat(getItems(arenda).containsAll(arendaItems)).isTrue();
    }
}
