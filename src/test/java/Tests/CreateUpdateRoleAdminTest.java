package Tests;
import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.Functions;
import Utilities.ReadProps;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import static Pages.CreateRolePage.*;
@Listeners(Utilities.TestListeners.class)
public class CreateUpdateRoleAdminTest extends BasePage {
    static CreateRolePage CreateRolePageObj;

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
    public void verify_list_of_role_is_present () throws Exception {
        CreateRolePageObj=new CreateRolePage(driver);
        CreateRolePageObj.ClickRoleManagementBtn();
        CreateRolePageObj.check_list_of_role_label();
        AssertionsFunction.isPresent(CreateRolePageObj.Listlabel);
    }

    @Test(priority = 2)
    public void verify_search_tab_is_present() throws Exception {
        //TC 4.3 Create User with Valid data.
        Assert.assertTrue(AssertionsFunction.isPresent(CreateRolePageObj.getsearchtab()));

    }

    @Test(priority = 3)
    public  void verify_role_sorting() throws Exception{
        CreateRolePageObj.rolesorting();
        AssertionsFunction.isPresent(CreateRolePageObj.permissionsort);
    }
    @Test(priority = 4)
            public  void verify_permission_sorting() throws Exception{
        CreateRolePageObj.permissionsorting();
        AssertionsFunction.isPresent(CreateRolePageObj.permissionsort);
    }
    @Test(priority = 5)
    public  void verify_created_sorting() throws Exception{
        CreateRolePageObj.createdsorting();
        AssertionsFunction.isPresent(CreateRolePageObj.permissionsort);
    }








}