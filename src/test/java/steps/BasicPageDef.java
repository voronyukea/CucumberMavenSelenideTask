package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {

    BasicPage basicPage = new BasicPage();
    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickInputButton(arg0);
    }

    @Then("Content with {string} label")
    public void contentWithLabel(String arg0) {
        basicPage.checkMainLogo(arg0);
    }


    @Then("Open menu {string}")
    public void openMenu(String arg0) {
        basicPage.clickParentAclassElement(arg0);
    }

    @Then("Open submenu {string}")
    public void openSubmenu(String arg0) {
        basicPage.clickAclassElement(arg0);
    }

    @Then("Сheck table availability")
    public void сheckTableAvailability() {
        basicPage.checkTableAviable();
    }

    @Then("Сreating preconditions for sorting a column {string}")
    public void сreatingPreconditionsForSortingAColumn(String arg0) {
        basicPage.clickAclassElement(arg0);
        Selenide.sleep(3000);
    }

    @Then("Save userdata before sorting")
    public void saveUserdataBeforeSorting() {
        basicPage.saveUsersAfterFisrtSort();
    }

    @Then("Apple first sort on a column {string}")
    public void appleFirstSortOnAColumn(String arg0) {
        basicPage.clickAclassElement(arg0);
        Selenide.sleep(3000);
    }


    @Then("Check userdata after first sorting")
    public void checkUserdataAfterFirstSorting() {
        basicPage.checkUserDataAfterFirstSort();
    }

    @Then("Apple second sort on a column {string}")
    public void appleSecondSortOnAColumn(String arg0) {
        basicPage.clickAclassElement(arg0);
        Selenide.sleep(3000);

    }
    @Then("Check userdata after second sorting")
    public void checkUserdataAfterSecondSorting() {
        basicPage.checkUserDataAfterSecondSort();
    }


}
