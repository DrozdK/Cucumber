package step;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;

import static helpers.CatalogHelper.*;

public class CarTest {

    private final String autoCar = "Автобарахолка";
    private final String motoCar = "Мотобарахолка";

    @When("Наводим на пункт автобарахолка")
    public void hoverToTheCarButton() {
        hoverTo(getElement(autoCar));
    }

    @Then("Проверяем что в подменю автобарахолки есть все пункты")
    public void check() {
        //given
        ArrayList<String> autoItems = new ArrayList<>();
        autoItems.add("Отзывы об авто");
        autoItems.add("Новые авто");
        autoItems.add("С пробегом");
        autoItems.add("Цена с НДС");
        autoItems.add("Авто до 4000 р.");
        autoItems.add("Авто до 10 000 р.");
        autoItems.add("Минск");
        autoItems.add("Гомель");
        autoItems.add("Могилев");
        autoItems.add("Витебск");
        autoItems.add("Гродно");
        autoItems.add("Брест");
        autoItems.add("Audi");
        autoItems.add("BMW");
        autoItems.add("Citroen");
        autoItems.add("Ford");
        autoItems.add("Mazda");
        autoItems.add("Mercedes-Benz");
        autoItems.add("Nissan");
        autoItems.add("Opel");
        autoItems.add("Peugeot");
        autoItems.add("Renault");
        autoItems.add("Toyota");
        autoItems.add("Volkswagen");

        ArrayList<String> motoItems = new ArrayList<>();
        motoItems.add("Aprilia");
        motoItems.add("BMW");
        motoItems.add("Harley-Davidson");
        motoItems.add("Honda");
        motoItems.add("HORS");
        motoItems.add("Jawa");
        motoItems.add("Kawasaki");
        motoItems.add("Suzuki");
        motoItems.add("Viper");
        motoItems.add("Yamaha");
        motoItems.add("Днепр");
        motoItems.add("Минск");

        //then
        Assertions.assertThat(getItems(autoCar).containsAll(autoItems)).isTrue();
        Assertions.assertThat(getItems(motoCar).containsAll(motoItems)).isTrue();
    }
}
