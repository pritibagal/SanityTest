package Tests;

import Base.BasePage;
import Pages.DocumentPage;
import Utilities.AssertionsFunction;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AuditTest extends  BasePage{
    static DocumentPage Docobj;

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
    public void verify_expansion_panel() throws Exception {
        Docobj = new DocumentPage(driver);
        Docobj.clickonauditbtn();
        Thread.sleep(3000);
        Assert.assertTrue(AssertionsFunction.isPresent(Docobj.getExpansionPanel()));
    }



    @Test(priority = 2)
    public void verify_status_sort() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(Docobj.getStatusSort()));
    }



    @Test(priority = 3)
    public void verify_assignee_sort() throws Exception {

        Assert.assertTrue(AssertionsFunction.isPresent(Docobj.getAssigneeSort()));
    }

    @Test(priority = 4)
    public void verify_type_sort() throws Exception {
        Assert.assertTrue(AssertionsFunction.isPresent(Docobj.getTypeSort()));
    }


    @Test(priority = 5)
    public void verify_doc_sort() throws Exception {

        Assert.assertTrue(AssertionsFunction.isPresent(Docobj.getDocSort()));
    }



}
