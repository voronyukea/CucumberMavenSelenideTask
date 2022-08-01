package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {


    @Before
    public void openURL(){
        open("http://test-app.d6.dev.devcaz.com/admin/login");
    }

    @After
    public void close() {
        closeWebDriver();
    }

}
