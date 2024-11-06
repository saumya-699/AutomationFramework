
package page_object_model.tests;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object_model.pages.DarazFlowersPage;
import page_object_model.pages.DarazHomePage;
import page_object_model.pages.BasePage;
import page_object_model.utilities.Utilities;
import page_object_model.utilities.ExcelUtils;


public class DarazSearchFlowers extends Utilities {
    ExcelUtils excelUtils;


    @Test
    public void searchFlowersTest1() {

        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        DarazHomePage homePage = basePage.loadUrl("https://www.daraz.lk/");
        excelUtils = new ExcelUtils("C:\\Users\\HP\\Documents\\SearchTermBook.xlsx", "Sheet1");
        String searchTerm = excelUtils.getCellData(1, 0);
        homePage.setSearchText(searchTerm);
        DarazFlowersPage FlowerPage = homePage.clickSearchButton();
        FlowerPage.scrollPage(100, 100);
        FlowerPage.selectCheckboxECHIDNA();
        FlowerPage.scrollPage(100, 400);
        FlowerPage.selectCheckBoxRed();
        Assert.assertTrue(FlowerPage.isCheckBoxSelectedECHIDNA(),"Echidna checkbox is not selected");
        Assert.assertTrue(FlowerPage.isCheckBoxSelectedRed(),"Red checkbox is not selected");
    }


    @Test
    public void searchFlowersTest2() {

        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        DarazHomePage homePage = basePage.loadUrl("https://www.daraz.lk/");
        excelUtils = new ExcelUtils("C:\\Users\\HP\\Documents\\SearchTermBook.xlsx", "Sheet1");
        String searchTerm = excelUtils.getCellData(1, 0);
        homePage.setSearchText(searchTerm);
        DarazFlowersPage FlowerPage = homePage.clickSearchButton();
        FlowerPage.scrollPage(100, 100);
        FlowerPage.selectCheckBoxShippedFromCentral();
        FlowerPage.scrollPage(100, 100);
        Assert.assertTrue(FlowerPage.isCheckBoxSelectedShippedFromCentral(),"shipped from central province checkbox is not selected");



    }

}



