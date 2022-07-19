package Tests;

import Base.BasePage;
import Pages.AnalyticsPage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.LoginUser;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;


@Listeners(Utilities.TestListeners.class)
public class AnalyticsTest extends BasePage
{
    static AnalyticsPage AnalyticsPageObj;
    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }
    @AfterClass
    public void cleanUp() throws Exception
    {

    driver.quit();
    }
    @Test(priority = 1)
    public void test_organization_arrows_on_analytics_page() throws Exception {

        AnalyticsPageObj = new AnalyticsPage(driver);
       Custome_Wait.wait(driver,driver.findElement(By.xpath("(//mat-icon[contains(text(),'create')])[1]")));

        AnalyticsPageObj.ClickAnalyticsBtn();

Thread.sleep(4000);
        // 1.1 Organization Statistics and Project Statistics Hide and UnHide.
        AnalyticsPageObj.ClickOrganizationArrow();
        AssertionsFunction.verifyElementPresent(AnalyticsPage.StatisticsHidden);
        AnalyticsPageObj.clickProjectStatisticsarrow();
        AnalyticsPageObj.ClickOrganizationArrow();
        AnalyticsPageObj.clickProjectStatisticsarrow();
        AssertionsFunction.verifyElementPresent(AnalyticsPage.ProjectStatistics);
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);



    }
    @Test(priority = 2)
    public void hover_total_users_on_Analytics_page() throws Exception {
        // 1.2 Hover on Total Users.
        AnalyticsPageObj.HoverTotalUser();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.TotalUser));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);




    }
    @Test(priority = 3)
    public void hover_total_documents_on_Analytics_page() throws Exception {
        // 1.3 Hover on Total Documents.
        AnalyticsPageObj.HoverDocuments();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.Document));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);



    }
    @Test(priority = 4)
    public void hover_processed_documents_on_Analytics_page() throws Exception {
        // 1.4 Hover on Processed Documents.
        AnalyticsPageObj.HoverProcessed();
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);




    }
    @Test(priority = 5)
    public void hover_ready_to_process_on_Analytics_page() throws Exception {
        // 1.5 Hover on Ready to Process Documents.
        AnalyticsPageObj.HoverReadyToProcess();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.ReadyToProcess));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);



    }
    @Test(priority = 6)
    public void hover_ready_to_rejected_documents_on_Analytics_page() throws Exception {
        // 1.6 Hover on Ready to Rejected Documents.
        AnalyticsPageObj.HoverRejected();
        Assert.assertTrue(AssertionsFunction.isPresent(AnalyticsPage.Rejected));
        AssertionsFunction.verifyTargetPageURL(AnalyticsPageObj.analyticurl);


    }

}