
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

public class DarazSearchFlowers extends Utilities {
    ExcelUtils excelUtils;


    @Test
    public void searchFlowersTest1() {

        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        DarazHomePage homePage = basePage.loadUrl("https://www.daraz.lk/");
        excelUtils = new ExcelUtils("C:\\Users\\HP\\Documents\\SearchTermBook.xlsx", "Sheet1");
        String searchTerm = excelUtils.getCellData(1, 0);
        homePage.setSearchText(searchTerm);
       // homePage.setSearchText("Flowers");
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
        homePage.setSearchText("Flowers");
        DarazFlowersPage FlowerPage = homePage.clickSearchButton();
        FlowerPage.scrollPage(100, 100);
        FlowerPage.selectCheckBoxShippedFromCentral();
        FlowerPage.scrollPage(100, 100);
       // FlowerPage.selectCheckBoxPurple();
        Assert.assertTrue(FlowerPage.isCheckBoxSelectedShippedFromCentral(),"shipped from central province checkbox is not selected");
        //Assert.assertTrue(FlowerPage.isCheckBoxSelectedPurple(),"purple checkbox is not selected");



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

