package com.CompanyName.pages;

import com.CompanyName.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleeceJacketPage {

    public FleeceJacketPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    public WebElement fleeceJacketTitle;

    @FindBy(xpath = "//div[@class='inventory_details_price']")
    public WebElement fleeceJacketPrice;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    public WebElement addToCartButton;


}
