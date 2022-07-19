package Tests;
import Base.BasePage;
import Pages.DatasetPage;
import Pages.TemplatePage;
import Utilities.AssertionsFunction;
import Utilities.Functions;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(Utilities.TestListeners.class)
public class TemplateTest extends BasePage {
    static TemplatePage Templatepageobj;

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
        Templatepageobj = new TemplatePage(driver);
        Thread.sleep(3000);
        Templatepageobj.clicktemplatebtn();
        Thread.sleep(3000);
        Assert.assertTrue(AssertionsFunction.isPresent(Templatepageobj.getSearchBox()));
    }

    @Test(priority = 2)
    public void verify_templatesort_is_present() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(Templatepageobj.getTemplatesort()));
    }

    @Test(priority = 3)
    public void verify_projectsort_is_present() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(Templatepageobj.getProjectsort()));
    }

    @Test(priority = 4)
    public void verify_pagesort_is_present() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(Templatepageobj.getPagesort()));
    }
    @Test(priority = 5)
    public void verify_trainingsort_is_present() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(Templatepageobj.gettrainingsort()));
    }



}

