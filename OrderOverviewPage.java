package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderOverviewPage {

    private WebDriver driver;

    private By finishButton = By.id("finish");

    public OrderOverviewPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickFinish(){
        driver.findElement(finishButton).click();
    }


}
