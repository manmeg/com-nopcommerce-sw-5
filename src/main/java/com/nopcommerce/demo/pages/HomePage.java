package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeOurStoreText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;


    public void selectMenu(String menu){
        List<WebElement> topMenuNames = driver.findElements(By.cssSelector("li>a"));
        for (WebElement names : topMenuNames) {
            //System.out.println(names.getText());
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }
    public void verifyWelcomeOurStoreText(){

        assertVerifyText(welcomeOurStoreText,"Welcome to our store");
    }
    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }
}
