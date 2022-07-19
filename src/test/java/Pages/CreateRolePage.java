package Pages;
import Utilities.Custome_Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Random;

public class CreateRolePage {
    WebDriver driver = null;
    //TC 6.1 element locators
    By searchUser  = By.xpath("//input[@placeholder='Search']");
    public By Listlabel = By.xpath("//h6[contains(text(),'List of Roles')]");
    public static By RoleManagementBtn = By.xpath("(//img[contains(@class,'mat-tooltip-trigger')])[2]");
    public By SearchRole = By.xpath("//input[@data-placeholder='Search']");
    public By rolesort = By.xpath("(//div[contains(@class,'mat-sort-header-arrow ng-trigger ng-trigger-arrowPosition ng-tns')])[1]");
    public By permissionsort = By.xpath("(//div[contains(@class,'mat-sort-header-arrow ng-trigger ng-trigger-arrowPosition ng-tns')])[2]");
    public By createdsort = By.xpath("(//div[contains(@class,'mat-sort-header-arrow ng-trigger ng-trigger-arrowPosition ng-tns')])[4]");

    public CreateRolePage(WebDriver driver) throws IOException {
        this.driver = driver;
    }


    public void ClickRoleManagementBtn() {
        driver.findElement(RoleManagementBtn).click();
    }

    public void check_list_of_role_label() {
        driver.findElement(Listlabel).click();

    }
    public  By getsearchtab(){return  this.searchUser;}


    public void rolesorting() {
        driver.findElement(rolesort).click();
    }

    public void permissionsorting() {
        driver.findElement(permissionsort).click();
    }


    public void createdsorting() {
        driver.findElement(createdsort).click();
    }
}