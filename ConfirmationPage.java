package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {

    private WebDriver driver;

    private By thankYouMessage = By.cssSelector(".complete-header");

    public ConfirmationPage(WebDriver driver){
        this.driver = driver;

    }
    public boolean isThankYouMessageDisplayed(){
        return driver.findElement(thankYouMessage).isDisplayed();
    }


}
