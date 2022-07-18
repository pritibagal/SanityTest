package Pages;

import Utilities.AssertionsFunction;
import Utilities.Custome_Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DocumentPage {
    WebDriver driver = null;
 /////locators
    public static By DocumentBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[6]");


public  static  By auditbtn=By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[7]");

    By ExpansionPanel = By.xpath("//span[contains(@class,'mat-expansion-indicator')]");



    //sorting
    By DocSort = By.xpath("(//div[contains(@class,'mat-sort-header-pointer-middle')])[1]");
    By AssigneeSort = By.xpath("(//div[contains(@class,'mat-sort-header-pointer-middle')])[2]");
    By StatusSort = By.xpath("(//div[contains(@class,'mat-sort-header-pointer-middle')])[3]");
    By TypeSort = By.xpath("(//div[contains(@class,'mat-sort-header-pointer-middle')])[4]");


    public DocumentPage(WebDriver driver) {
        this.driver = driver;
    }
    public  void clickondocumentbtn(){
        driver.findElement(DocumentBtn).click();
}
public  void clickonauditbtn(){
        driver.findElement(auditbtn).click();
}

public  By getExpansionPanel(){
        return  this.ExpansionPanel;
}


    public  By getDocSort(){
        return  this.DocSort;
    }



    public  By getAssigneeSort(){
        return  this.AssigneeSort;
    }



    public  By getStatusSort(){
        return  this.StatusSort;
    }


    public  By getTypeSort(){
        return  this.TypeSort;
    }
}



