package steps;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openURL(){
        open("http://test-app.d6.dev.devcaz.com/admin/login");
    }
}
