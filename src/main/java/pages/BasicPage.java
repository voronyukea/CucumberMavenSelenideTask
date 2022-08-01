package pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    public String userNameBeforeSort;


    public void clickInputButton(String text) {
        $(By.xpath("//input[@value='" + text + "']")).click();
    }

    public void checkMainLogo(String text) {
        $(By.xpath("//img[@alt='" + text + "']")).shouldBe(Condition.visible);
    }

    public void clickParentAclassElement(String text) {
        $(By.xpath("//span[text()='" + text + "']/parent::a")).click();
    }

    public void clickAclassElement(String text) {
        $(By.xpath("//a[text()='" + text + "']")).click();
    }

    public void checkTableAviable() {
        $(By.xpath("//div[@id='payment-system-transaction-grid']")).shouldBe(Condition.visible);
    }


    public void saveUsersAfterFisrtSort() {
        SelenideElement elemBeforeSort  = $(By.xpath("(//td[@class='centered hide-mobile'])[1]/following-sibling::td[1]/child::a"));
        userNameBeforeSort = elemBeforeSort.text();
    }

    public void checkUserDataAfterFirstSort() {
        clickAclassElement("Last >>");
        Selenide.sleep(3000);
        SelenideElement elemAfterSort  = $(By.xpath("(//td[@class='centered hide-mobile'])[last()]/following-sibling::td[1]/child::a"));
        String userNameAfterSort = elemAfterSort.text();
        userNameBeforeSort.equals(userNameAfterSort);
    }

    public void checkUserDataAfterSecondSort() {
        clickAclassElement("<< First");
        Selenide.sleep(3000);
        SelenideElement elemAfterSecondSort  = $(By.xpath("(//td[@class='centered hide-mobile'])[1]/following-sibling::td[1]/child::a"));
        String userNameAfterSecondSort = elemAfterSecondSort.text();
        userNameBeforeSort.equals(userNameAfterSecondSort);
    }
}
