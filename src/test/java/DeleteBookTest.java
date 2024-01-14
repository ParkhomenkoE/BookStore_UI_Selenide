import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class DeleteBookTest extends BaseTest{

    @Test
    public void deleteOneBook(){
        $(By.id("login")).click();
        loginPage.enterUsername("Rosa");
        loginPage.enterPassword("Rosa35B!");
        loginPage.clickOnLoginButton();
        loginPage.followProfileLink();
        profilePage.deleteOneBook(1);
        profilePage.confirmModalWindow();
        switchTo().alert().accept();

    }
}
