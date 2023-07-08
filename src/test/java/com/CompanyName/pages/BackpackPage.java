package com.CompanyName.pages;

import com.CompanyName.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BackpackPage {

    public BackpackPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    public WebElement backpackTitle;

    @FindBy(xpath = "//div[@class='inventory_details_price']")
    public WebElement backpackPrice;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement addToCartButton;










}
