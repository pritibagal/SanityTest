package Pages;

import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver = null;

    //locator
    public By usererrmsg=By.xpath("//span[text()='User is inactive. Please contact Administration']");
    @FindBy (xpath="//label[text()='Email Id']//following::input[1]")
    WebElement userName;
    @FindBy (xpath="//input[@formcontrolname='password']")
    WebElement password;
    @FindBy (xpath="//button[@type='submit']")
    WebElement loginBtn;
    @FindBy (xpath="//span[@mattooltip='Logout']")
    WebElement Logout;
    @FindBy (xpath="//span[contains (text(),'Please Enter Valid Data ...!')]")
    WebElement ErrorMsgInvalidData;
    @FindBy (xpath="//span[contains (text(),'Something Went Wrong ...!')]")
    WebElement ErrorMsgDisableUser;
    @FindBy (xpath="//span[text()='User is inactive. Please contact Administration']")
    WebElement ErrorMsgIdPwdSame;
    @FindBy (xpath="//span[text()='Password cannot be email Id']")
    WebElement ErrMsgIdPwdSame;

    @FindBy (xpath="//span[contains (text(),'Please Enter Valid Data ...!')]")
    WebElement ErrorMsgBlankData;

    //Constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void EnterUsername(String text) throws Exception
    {
        Custome_Wait.waitElement(driver,userName);
        driver.navigate().refresh();
        userName.sendKeys(text);
    }

    //Methods Declaration.
    public void setPassword(String text) throws Exception{
        Custome_Wait.waitElement(driver,password);
        password.sendKeys(text);
    }

    public void clickLoginButtonForValidInput() throws Exception
    {
        Custome_Wait.waitElement(driver,loginBtn);
        loginBtn.click();
        Thread.sleep(15000);
    }





}