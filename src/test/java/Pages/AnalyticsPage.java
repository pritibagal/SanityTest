package Pages;
import Utilities.Custome_Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
///pages classs
public class
AnalyticsPage {

    WebDriver driver = null;

    //xpath change by suwarna
    public static By AnalyticsBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[8]");
    By OrganizationStatistics =By.xpath("//span[text()='Project Statistics']");
    public static By StatisticsHidden = By.xpath("//span[text()='Project Statistics']//following::span[2]");
    public static By TotalUser = By.xpath("//div[text()=' Users ']");
    public  static By Document = By.xpath("//div[text()=' Users ']//following::div[5]");
   public static By Processed = By.xpath("//div[text()=' Users ']//following::div[22]");

    public  static  By ReadyToProcess = By.xpath("//div[text()=' Users ']//following::div[32]");
  public  static   By Rejected = By.xpath("//div[text()=' Users ']//following::div[40]");


public  String analyticurl="https://omega.neutrino-ai.com/#/home/analytics";

    public static By AnalyticsPageDisplay= By.xpath("//div[@class='row ng-star-inserted']");
    public static By ProjectStatistics = By.xpath("//span[text()='Project Statistics']");

    //Constructor for Analytics Page.
    public AnalyticsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickAnalyticsBtn() throws Exception {
        Custome_Wait.wait(driver,AnalyticsBtn);
        driver.findElement(AnalyticsBtn).click();
    }



    public  void ClickOrganizationArrow() throws Exception{
        Custome_Wait.wait(driver,OrganizationStatistics);
        Thread.sleep(2000);
        driver.findElement(OrganizationStatistics).click();
    }

    public  void clickProjectStatisticsarrow() throws Exception{
        Custome_Wait.wait(driver,ProjectStatistics);
        driver.findElement(ProjectStatistics).click();
    }


    public  void HoverTotalUser(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(TotalUser);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

    public void HoverDocuments()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Document);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }

    public void HoverProcessed()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Processed);
        action.moveToElement(element).build().perform();

    }

    public void HoverReadyToProcess()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(ReadyToProcess);
        action.moveToElement(element).build().perform();
    }

    public void HoverRejected()
    {
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Rejected);
        action.moveToElement(element).build().perform();
    }




}