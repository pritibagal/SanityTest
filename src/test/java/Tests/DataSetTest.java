package Tests;
import Base.BasePage;
import Pages.DatasetPage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(Utilities.TestListeners.class)
public class DataSetTest extends BasePage {
    static DatasetPage DatasetPageObj;

    @BeforeClass
    public void login() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }


    @AfterClass
    public void cleanUp() throws Exception {
        driver.quit();
    }
    @Test(priority = 1)
    public void verify_searchbox_is_present() throws Exception {
        DatasetPageObj = new DatasetPage(driver);
        Thread.sleep(3000);
        DatasetPageObj.ClickDatasetBtn();
        Thread.sleep(3000);
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getSearchBox()));
    }

    @Test(priority = 2)
    public void verify_categorysort_is_present() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getcategory()));
    }

    @Test(priority = 3)
    public void verify_updatedsort_is_present() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getUpdatesort()));
    }

    @Test(priority = 4)
    public void verify_datasetsort_is_present() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getDatasets()));
    }
    @Test(priority = 5)
    public void verify_trainingsort_is_present() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(DatasetPageObj.getcreatesort()));
    }



    }

