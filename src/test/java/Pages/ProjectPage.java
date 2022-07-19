package Pages;

import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectPage   {

    WebDriver driver = null;


//locators

    public static By ProjectBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[5]");
    public static By CreateProject = By.xpath("//span[contains(text(),' Create Project ')]");
    By TableStructure = By.xpath("//*[contains(text(),' list ')]");
    By liststructure=By.xpath("(//mat-icon[contains(text(),'list')])[1]");
    By editbtn=By.xpath("(//mat-icon[contains(text(),'create')])[1]");
    By LoginBtn = By.xpath("//button[@type='submit']");
    By Username = By.xpath("//input[@formcontrolname='userName']");
    By Password = By.xpath("//input[@formcontrolname='password']");

    // User Update

    By SearchBtn = By.xpath("//input[@data-placeholder='Search']");

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }



    public void ClickOnProjectBtn() throws  Exception {
        driver.findElement(ProjectBtn).click();
        Thread.sleep(2000);
    }
    public By getcreateproject(){
        return  this.CreateProject;
    }


    public By getsearchbox(){
        return  this.SearchBtn;
    }
    public By getTableStructure(){
        return  this.TableStructure;
    }
    public By getliststructure(){
        return  this.liststructure;
    }

   public By getediticon(){
        return this.editbtn;
   }


    public void EnterUsername(String text) throws Exception{

        driver.findElement(Username).sendKeys(text);
    }

    public void EnterPassword(String text) throws Exception{

        driver.findElement(Password).sendKeys(text);
    }

    public void ClickLoginButton() throws Exception{

        driver.findElement(LoginBtn).click();
        Thread.sleep(8000);
    }

}