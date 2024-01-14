import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LogoutTest extends BaseTest {
    @Test
    public void successLogin() {
        $(By.id("login")).click();
        loginPage.enterUsername("Rosa");
        loginPage.enterPassword("Rosa35B!");
        loginPage.clickOnLoginButton();
        profilePage.getAuthorField().shouldBe(visible);
        profilePage.clickLogOutButton();
        loginPage.getLoginButtonInLoginPage().shouldBe(visible);
        loginPage.followProfileLink();
        profilePage.getNotLogginLabel().shouldHave(text("Currently you are not logged into the Book Store application, please visit the login page to enter or register page to register yourself."));




    }
}