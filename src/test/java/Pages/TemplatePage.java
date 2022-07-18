package Pages;

import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

public class TemplatePage   {


    WebDriver driver = null;
    public static By Templatebtn= By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[3]");
    By SearchBox = By.xpath("//input[@data-placeholder='Search']");        //driver.clear();
    By Templatesort=By.xpath("//div[contains(text(),' Templates ')]");
    By projectsort=By.xpath("//div[contains(text(),' Projects ')]");
    By pagesort=By.xpath("//div[contains(text(),' Pages ')]");
    By trainingsort=By.xpath("//div[contains(text(),' Training ')]");

    public TemplatePage(WebDriver driver) {
        this.driver=driver;
    }


    public void clicktemplatebtn(){ driver.findElement(Templatebtn).click();}
    public  By getSearchBox(){
        return  this.SearchBox;
    }

    public By getTemplatesort(){
        return  this.Templatesort;
    }

    public By getProjectsort(){
        return  this.projectsort;
    }


    public By getPagesort(){
        return  this.pagesort;
    }

    public By gettrainingsort(){
        return  this.trainingsort;
    }
    }