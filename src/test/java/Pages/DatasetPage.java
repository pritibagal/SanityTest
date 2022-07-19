
package Pages;

import Utilities.Custome_Wait;
import Utilities.ReadProps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class DatasetPage {

    WebDriver driver = null;
        public static By DatasetBtn= By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[4]");
        By SearchBox = By.xpath("//input[@data-placeholder='Search']");        //driver.clear();
        By getcategory=By.xpath("//div[contains(text(),' Category ')]");
        By getdatasetsort=By.xpath("//div[contains(text(),' Datasets ')]");
        By updatesort=By.xpath("//div[contains(text(),' Updated ')]");
        By createsort=By.xpath("//div[contains(text(),' Created ')]");

        public DatasetPage(WebDriver driver){
            this.driver=driver;
        }
        public void ClickDatasetBtn(){ driver.findElement(DatasetBtn).click();}
    public  By getSearchBox(){
            return  this.SearchBox;
    }
    public By getcategory(){
            return  this.getcategory;
    }


    public By getDatasets(){
        return  this.getdatasetsort;
    }


    public By getUpdatesort(){
        return  this.updatesort;
    }

    public By getcreatesort(){
            return  this.createsort;
    }
}