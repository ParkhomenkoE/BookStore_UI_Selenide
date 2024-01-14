import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.empty;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Integer.parseInt;
import static java.time.Duration.ofSeconds;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;
import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.By.className;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;


public class ProfilePage {
    private SelenideElement profileHeader = $("[class='main-header']");
    public SelenideElement getProfileHeader() {
        return profileHeader;
    }
    private SelenideElement headerBooksTable = $(By.cssSelector("[class='rt-table']"));
    public SelenideElement getHeaderBooksTable() {
        return headerBooksTable;
    }
    private SelenideElement registeredUserName = $(By.id("userName-value"));
    public SelenideElement getRegisteredUserName() {
        return registeredUserName;
    }
    private SelenideElement authorField = $(className("rt-resizable-header-content"));

    public SelenideElement getAuthorField() {
        return authorField;
    }

    private SelenideElement notLogginLabel = $(By.id("notLoggin-label"));


    public SelenideElement getNotLogginLabel() {
        return notLogginLabel;
    }

    private SelenideElement logOutButton = $x("//*[text()='Log out']");

    public void clickLogOutButton() {
        logOutButton.shouldBe(visible).click();
    }

    private ElementsCollection booksTitleCollection = $$(className("action-buttons"));

    /* public String getTitleCollection(int index) {
        return booksTitleCollection.filter(not(empty)).get(index).shouldBe(visible).getText();
    } */

    private ElementsCollection actionDelete = $$(By.id("delete-record-undefined"));

    public void deleteOneBook(int bookIndex) {
        actionDelete.get(bookIndex).scrollTo().click();
    }

    private SelenideElement confirmModalWindow = $(By.id("closeSmallModal-ok"));

    public void confirmModalWindow() {
        if (confirmModalWindow.isDisplayed()) {
            confirmModalWindow.click();
        } else {
            confirm();
        }
    }
    private ElementsCollection booksCollection = $$(By.cssSelector("[class ='rt-tr-group']"));

    public void isBookCollectionDisplayed() {
        for (SelenideElement book : booksCollection) {
            book.shouldBe(visible);
        }
    }
    private SelenideElement deleteAccountButton = $x("//*[text()='Delete Account']");
    public void deleteAccount() {
        deleteAccountButton.scrollTo().shouldBe(visible).click();
    }
    private SelenideElement invalidUsernameAndPasswordMessage = $(By.id("name"));



}

