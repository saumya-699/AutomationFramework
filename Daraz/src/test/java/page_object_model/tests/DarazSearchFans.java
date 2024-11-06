package page_object_model.tests;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object_model.pages.DarazHomePage;
import page_object_model.pages.DarazFansPage;
import page_object_model.pages.BasePage;
import page_object_model.utilities.Utilities;
import page_object_model.utilities.ExcelUtils;


    public class DarazSearchFans extends Utilities {
        ExcelUtils excelUtils;

        @Test
        public void searchFansTest1() {

            BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
            DarazHomePage homePage = basePage.loadUrl("https://www.daraz.lk/");
            excelUtils = new ExcelUtils("C:\\Users\\HP\\Documents\\SearchTermBook.xlsx", "Sheet1");
            String searchTerm = excelUtils.getCellData(2, 0);
            homePage.setSearchText(searchTerm);
            DarazFansPage fansPage = homePage.clickSearchButton();
            fansPage.scrollPage(100, 10);
            fansPage.scrollPage(100, 200);
            fansPage.selectBrandWarrantyCheckbox();
            fansPage.scrollPage(100, 20);
            fansPage.selectWarrantyPeriodCheckbox();
            Assert.assertTrue(fansPage.isCheckboxSelectedBrandWarranty(),"shipped from central province checkbox is not selected");


        }
    }





