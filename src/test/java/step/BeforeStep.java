package step;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeOptions;

import static constants.Constants.TimeoutVariable.IMPLICIT_WAIT;

public class BeforeStep {

    @Given("Открываем сайт {string}")
    public void openWebSite(String url) {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        Configuration.timeout = IMPLICIT_WAIT;
        Selenide.open(url);
    }
}
