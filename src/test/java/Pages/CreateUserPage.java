package Pages;
import Base.BasePage;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

public class CreateUserPage extends BasePage
{


    public static By UserBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[1]");
    public static By CreateUserBtn = By.xpath("//span[text()=' Create User ']");
    public  static By selectSearchedUser=By.xpath("(//mat-icon[contains(text(),'create')])[1]");
    By searchUser  = By.xpath("//input[@placeholder='Search']");
   public  By gridview=By.xpath("//mat-icon[contains(text(),' grid_on')]");
   public By listview=By.xpath("//mat-icon[contains(text(),' list ')]");
   public CreateUserPage(WebDriver driver) throws IOException
    {
        BasePage.driver = driver;
    }

    public  By getgridview(){ return  this.gridview;}
public  By getsearchtab(){return  this.searchUser;}
public  By getlistview(){return  this.listview;}
    public  void clickOnUserMenu()
    {
        driver.findElement(UserBtn).click();
    }
    public By getEditbutton()
    {
        return this.selectSearchedUser;
    }
    public By getUser()
    {
        return this.selectSearchedUser;
    }
public By getCreateUserBtn(){
       return this.CreateUserBtn;}





    public  void SearchCreatedUser(String text)throws Exception
    {
        driver.findElement(searchUser).sendKeys(text);
    }


}