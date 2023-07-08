package com.CompanyName.pages;

import com.CompanyName.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

    public ShoppingCart(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public WebElement inventoryItem;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    public WebElement removeBackpackButton;

    @FindBy(xpath = "//button[@id='continue-shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement checkoutButton;


}
