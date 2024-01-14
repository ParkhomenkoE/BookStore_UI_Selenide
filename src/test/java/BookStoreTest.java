import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.empty;
import static org.junit.Assert.assertEquals;

public class BookStoreTest extends BaseTest{


    @Test
    public void booksReviewIsDisplayed(){
        bookStorePage.selectBook(1);
        bookDetailedInformation.getBookReviewDisplay().shouldBe(visible);
    }


    @Test
    public void rowsOptionsTest() {
        List<String> expectedRowsSelector = new ArrayList<>();
        expectedRowsSelector.add("5 rows");
        expectedRowsSelector.add("10 rows");
        expectedRowsSelector.add("20 rows");
        expectedRowsSelector.add("25 rows");
        expectedRowsSelector.add("50 rows");
        expectedRowsSelector.add("100 rows");
        bookStorePage.clickRowSelector();
        List<String> actualRowsSelector = new ArrayList<>(bookStorePage.getRowsOptions());
        assertEquals("Expected row selector quantity and actual does not match", expectedRowsSelector, actualRowsSelector);


}

}
