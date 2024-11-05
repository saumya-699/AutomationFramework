package page_object_model.tests;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_object_model.pages.BasePage;
import page_object_model.pages.DarazHelpPage;
import page_object_model.pages.DarazHomePage;
import page_object_model.utilities.ExcelUtils;
import page_object_model.utilities.Utilities;

import java.time.Duration;

public class DarazHelp extends Utilities {

    @DataProvider(name = "searchHelpTerms")
    public Object[][] getSearchTerms() {
        ExcelUtils excelUtils = new ExcelUtils("C:\\Users\\HP\\Documents\\HelpQuestionBook.xlsx", "Sheet1");
        int rowCount = excelUtils.getRowCount();
        Object[][] data = new Object[rowCount][1];
        for (int i = 0; i < rowCount; i++) {
            data[i][0] = excelUtils.getCellData(i, 0);
        }

        return data;
    }

    @Test(dataProvider = "searchHelpTerms")
    public void searchHelpTest(String searchHelpTerm) {
        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        WebDriverWait wait = new WebDriverWait(browserFactory.getDriver(), Duration.ofSeconds(30));
        DarazHomePage homePage = basePage.loadUrl("https://www.daraz.lk/");

        homePage.clickHelpAndSupport();
        DarazHelpPage helpPage = homePage.clickSelectHelpCenterHref();
        wait.until(ExpectedConditions.visibilityOf(helpPage.helpSearchBox));
        helpPage.setHelpSearchText(searchHelpTerm);


    }
}
