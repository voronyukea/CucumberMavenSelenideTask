package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();

    @Then("Input Login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input Password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }
}
