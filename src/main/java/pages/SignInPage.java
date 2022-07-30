package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class SignInPage {


    private SelenideElement loginInput = $(By.xpath("//input[@placeholder='Login']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@placeholder='Password']"));

    public void inputLogin(String text) {
      this.loginInput.val(text);
    }

    public void inputPassword(String text){
        this.passwordInput.val(text);
    }
}
