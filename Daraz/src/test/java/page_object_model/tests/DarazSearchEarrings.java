
package page_object_model.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object_model.pages.DarazEarringsPage;
import page_object_model.pages.DarazHomePage;
import page_object_model.pages.BasePage;
import page_object_model.utilities.Utilities;
import page_object_model.utilities.ExcelUtils;

import java.time.Duration;

public class DarazSearchEarrings extends Utilities {
    ExcelUtils excelUtils;



    @Test
    public void searchEarringsTest1() {

        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        WebDriverWait wait = new WebDriverWait(browserFactory.getDriver(), Duration.ofSeconds(30));
        DarazHomePage homePage = basePage.loadUrl("https://www.daraz.lk/");
        excelUtils = new ExcelUtils("C:\\Users\\HP\\Documents\\SearchTermBook.xlsx", "Sheet1");
        String searchTerm = excelUtils.getCellData(0, 0);
        homePage.setSearchText(searchTerm);
        DarazEarringsPage EarringsPage = homePage.clickSearchButton();
        EarringsPage.scrollPage(100, 200);
        EarringsPage.setMinValue("500");
        EarringsPage.setMaxValue("2000");
        EarringsPage.scrollPage(100, 200);
        EarringsPage.selectCheckBoxLocalSellerWarranty();
        Assert.assertTrue(EarringsPage.isCheckboxSelectedLocalSellerWarranty(), "LocalSellerWarranty checkbox is not selected.");

    }

    @Test
    public void searchEarringsTest2() {
        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        WebDriverWait wait = new WebDriverWait(browserFactory.getDriver(), Duration.ofSeconds(30));
        DarazHomePage homePage = basePage.loadUrl("https://www.daraz.lk/");
        excelUtils = new ExcelUtils("C:\\Users\\HP\\Documents\\SearchTermBook.xlsx", "Sheet1");
        String searchTerm = excelUtils.getCellData(0, 0);
        homePage.setSearchText(searchTerm);
        DarazEarringsPage EarringsPage = homePage.clickSearchButton();
        EarringsPage.scrollPage(100, 10);
        EarringsPage.selectCheckBoxBodhi();
        EarringsPage.scrollPage(100, 80);
        EarringsPage.selectCheckBoxShippedFromWestern();
        EarringsPage.scrollPage(100, 80);
        wait.until(ExpectedConditions.visibilityOf((WebElement) EarringsPage.textBoxMaxValue));
        EarringsPage.setMaxValue("1500");
        Assert.assertTrue(EarringsPage.isCheckboxSelectedVoucherMax(), "Voucher Max checkbox is not selected.");

    }


}




