package pages;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import java.util.Collections;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class BasicPage {

    //Кнопки на основе элемента input
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
            ElementsCollection userNameBeforeSort = $$(By.xpath("(//td[@class='centered hide-mobile'])/following-sibling::td[1]/child::a"));
            List<String> usersListBeforeSort = userNameBeforeSort.texts();
            usersListBeforeSort.removeAll(usersListBeforeSort.subList(9, 19));
        }


    public void checkUserDataAfterFirstSort(){

        clickAclassElement("Last >>");
        Selenide.sleep(3000);
        ElementsCollection userNameAfterSort = $$(By.xpath("//td[@class='centered hide-mobile']/following-sibling::td[1]/child::a"));
        List<String> usersListAfterSort =  userNameAfterSort.texts();
        usersListAfterSort.removeAll(usersListAfterSort.subList(9, 14));
        Collections.reverse(usersListAfterSort);
//        assert usersListAfterSort.equals(saveUsersAfterFisrtSort());

    }
}
