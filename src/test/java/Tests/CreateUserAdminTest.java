package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.AssertionsFunction;
import  Utilities.Custome_Wait;
import Utilities.Functions;
import Utilities.LoginUser;
import Utilities.ReadProps;
import com.google.cloud.storage.Acl;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

import static Pages.CreateRolePage.*;

@Listeners(Utilities.TestListeners.class)

public class CreateUserAdminTest extends BasePage {
    static CreateUserPage UserPageObj;
    @BeforeClass
    public void driverinit() throws Exception {
        BasePage.driverInit();
        BasePage.LoginTest();
    }

    @AfterClass
    public void cleanUp() throws Exception
    {
        driver.quit();
    }
    @Test(priority = 1)
    public void check_grid_view_is_present() throws Exception {

        UserPageObj = new CreateUserPage(driver);
        //TC 4.1 Valid Login with Admin credentials.
        Thread.sleep(4000);
        UserPageObj.clickOnUserMenu();
        Thread.sleep(4000);
        Assert.assertTrue(AssertionsFunction.isPresent(UserPageObj.getgridview()));

    }
    @Test(priority = 2)
    public void check_list_view_is_present() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(UserPageObj.getlistview()));

    }

    @Test(priority = 3)
    public void verify_search_tab_is_present() throws Exception {
        //TC 4.3 Create User with Valid data.
        Assert.assertTrue(AssertionsFunction.isPresent(UserPageObj.getsearchtab()));

    }
    @Test(priority = 4)
    public void create_user_with_invalid_data() throws Exception {
        //TC 4.4 Create user with Invalid data.
        Assert.assertTrue(AssertionsFunction.isPresent(UserPageObj.getEditbutton()));


    }

    @Test(priority = 5)
    public void disable_user() throws Exception {
        //TC 4.5 Disable user.
        Assert.assertTrue(AssertionsFunction.isPresent(UserPageObj.getCreateUserBtn()));


    }




}
