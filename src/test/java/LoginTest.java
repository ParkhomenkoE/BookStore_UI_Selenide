import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class LoginTest extends BaseTest{

        @Test
        public void successLogin(){
            $(By.id("login")).click();
            loginPage.enterUsername("Rosa");
            loginPage.enterPassword("Rosa35B!");
            loginPage.clickOnLoginButton();
            profilePage.getAuthorField().shouldBe(visible);
    }

    @Test
    public void invalidUserName(){
        $(By.id("login")).click();
        loginPage.enterUsername("Rosary");
        loginPage.enterPassword("Rosa35B!");
        loginPage.clickOnLoginButton();
        loginPage.getErrorLoginMessage().shouldBe(visible).shouldHave(text("Invalid username or password!"));
    }

    @Test
    public void invalidPassword(){
        $(By.id("login")).click();
        loginPage.enterUsername("Rosa");
        loginPage.enterPassword("Rosa");
        loginPage.clickOnLoginButton();
        loginPage.getErrorLoginMessage().shouldBe(visible).shouldHave(text("Invalid username or password!"));
    }

    @Test
    public void emptyUserNameField(){
        $(By.id("login")).click();
        loginPage.enterPassword("Rosa35B!");
        loginPage.clickOnLoginButton();
        loginPage.getInvalidUserNameForm().shouldBe(visible).shouldHave(attribute("validationMessage","Please fill out this field."));
    }

    @Test
    public void emptyPasswordField(){
        $(By.id("login")).click();
        loginPage.enterUsername("Rosa");
        loginPage.clickOnLoginButton();
        loginPage.getInvalidPasswordForm().shouldBe(visible).shouldHave(attribute("validationMessage","Please fill out this field."));
    }

    @Test
    public void emptyAuthorizationFields(){
        $(By.id("login")).click();
        loginPage.enterUsername("Rosa");
        loginPage.clickOnLoginButton();
        loginPage.getInvalidPasswordForm().shouldBe(visible).shouldHave(attribute("validationMessage","Please fill out this field."));
        loginPage.getInvalidPasswordForm().shouldBe(visible).shouldHave(attribute("validationMessage","Please fill out this field."));
    }





}
