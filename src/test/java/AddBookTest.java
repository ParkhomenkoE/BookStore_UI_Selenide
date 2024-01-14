import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddBookTest extends BaseTest{
@Test
    public void addOneBook() {
        $(By.id("login")).click();
        loginPage.enterUsername("Rosa");
        loginPage.enterPassword("Rosa35B!");
        loginPage.clickOnLoginButton();
        String selectedBook = bookStorePage.getTitleCollection(1);
        bookStorePage.selectBook(1);
        bookStorePage.clickAddToCollectionButton();

    }

}
