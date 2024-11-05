package page_object_model.tests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object_model.pages.DarazEarringsPage;
import page_object_model.pages.DarazFlowersPage;
import page_object_model.pages.DarazHomePage;
import page_object_model.pages.DarazFansPage;
import page_object_model.pages.BasePage;
import page_object_model.utilities.Utilities;
import page_object_model.utilities.ExcelUtils;

import java.time.Duration;

    public class DarazSearchFans extends Utilities {
        ExcelUtils excelUtils;

        @Test
        public void searchFansTest1() {

            BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
            DarazHomePage homePage = basePage.loadUrl("https://www.daraz.lk/");
            WebDriverWait wait = new WebDriverWait(browserFactory.getDriver(), Duration.ofSeconds(30));
            excelUtils = new ExcelUtils("C:\\Users\\HP\\Documents\\SearchTermBook.xlsx", "Sheet1");
            String searchTerm = excelUtils.getCellData(2, 0);
            homePage.setSearchText(searchTerm);
            homePage.setSearchText(searchTerm);
            //homePage.setSearchText("Fans");
            DarazFansPage fansPage = homePage.clickSearchButton();
            fansPage.scrollPage(100, 10);
            //wait.until(ExpectedConditions.elementToBeClickable(fansPage.aikoCheckBox));
           // fansPage.selectAikoCheckBox();
            fansPage.scrollPage(100, 200);
            fansPage.selectBrandWarrantyCheckbox();
            fansPage.scrollPage(100, 20);
           // wait.until(ExpectedConditions.elementToBeClickable(fansPage.WarrantyPeriodCheckbox));
            fansPage.selectWarrantyPeriodCheckbox();
            //Assert.assertTrue(fansPage.isCheckboxSelectedAiko(),"Aiko checkbox is not selected");
             Assert.assertTrue(fansPage.isCheckboxSelectedBrandWarranty(),"shipped from central province checkbox is not selected");
             //Assert.assertTrue(fansPage.isCheckboxSelectedWarrantyPeriod(),"purple checkbox is not selected");


        }
    }



//
//@Test
//public void searchEarringsTest2() {
//    BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
//    WebDriverWait wait = new WebDriverWait(browserFactory.getDriver(), Duration.ofSeconds(30));
//    DarazHomePage homePage = basePage.loadUrl("https://www.daraz.lk/");
//    homePage.setSearchText("Earrings");
//    DarazEarringsPage EarringsPage =homePage.clickSearchButton();
//    //  wait.until((ExpectedConditions.elementToBeClickable(EarringsPage.getRadioButtonFlower())));
//    //EarringsPage.scrollPage(100,400);
//    // wait.until((ExpectedConditions
//    // .elementToBeClickable(EarringsPage.getCheckBoxFreeShipping())));
//    EarringsPage.scrollPage(100,50);
//    // wait.until((ExpectedConditions.elementToBeClickable(EarringsPage.getCheckBoxYfashion())));
//    EarringsPage.selectCheckBoxYfashion();
//    EarringsPage.scrollPage(100,100);
//    // wait.until((ExpectedConditions.elementToBeClickable(EarringsPage.getCheckBoxVoucherMax())));
//    EarringsPage.selectCheckBoxVoucherMax();
//    EarringsPage.scrollPage(100,100);
//    EarringsPage.setMaxValue("1500");
////       EarringsPage.scrollPage(0,-200);
////       EarringsPage.selectEarringsImage();
//
//}



