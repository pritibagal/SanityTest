package Tests;
import Base.BasePage;
import Pages.ProjectPage;
import Utilities.AssertionsFunction;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

@Listeners(Utilities.TestListeners.class)

public class Project extends BasePage
{

    static ProjectPage projectobj;
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
    public void verify_create_project_button_is_present() throws Exception {
        projectobj = new ProjectPage(driver);
        //TC 13.1 Click on N-Icon.
      projectobj.ClickOnProjectBtn();
        Assert.assertTrue(AssertionsFunction.isPresent(projectobj.getcreateproject()));

    }


    @Test(priority = 2)
    public void verify_searchbox_is_present() throws Exception {
        projectobj = new ProjectPage(driver);

        Assert.assertTrue(AssertionsFunction.isPresent(projectobj.getsearchbox()));

    }


    @Test(priority = 3)
    public void verify_table_structure_is_present() throws Exception {
        projectobj = new ProjectPage(driver);

        Assert.assertTrue(AssertionsFunction.isPresent(projectobj.getTableStructure()));

    }

    @Test(priority = 4)
    public void verify_list_structure_is_present() throws Exception {
        projectobj = new ProjectPage(driver);

        Assert.assertTrue(AssertionsFunction.isPresent(projectobj.getliststructure()));

    }

    @Test(priority = 5)
    public void verify_edit_button_is_present() throws Exception {
        projectobj = new ProjectPage(driver);

        Assert.assertTrue(AssertionsFunction.isPresent(projectobj.getediticon()));

    }



}