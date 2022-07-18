package Tests;

import Base.BasePage;
import Pages.CreateRolePage;
import Pages.CreateUserPage;

import Pages.ProjectPage;
import Pages.Settingpage;
import Utilities.*;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

@Listeners(Utilities.TestListeners.class)
public class Setting extends BasePage {
static Settingpage settingpageobj;

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
    public static void verify_theme_label() throws Exception {
        settingpageobj =new Settingpage(driver);
        settingpageobj.clickonsettingbtn();
        Assert.assertTrue(AssertionsFunction.isPresent(settingpageobj.getlabel()));
    }

    @Test(priority = 2)
    public static void verify_apply_button() throws Exception {

        Assert.assertTrue(AssertionsFunction.isPresent(settingpageobj.getApplybtn()));
    }


    @Test(priority = 3)
    public static void verify_cancel_button() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(settingpageobj.getCancelbtn()));
    }


    @Test(priority = 4)
    public static void verify_theme_box() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(settingpageobj.getThemebox()));
    }

    @Test(priority = 5)
    public static void verify_close_button() throws Exception {

        Assert.assertTrue(AssertionsFunction.isPresent(settingpageobj.getclosebtn()));
    }

}