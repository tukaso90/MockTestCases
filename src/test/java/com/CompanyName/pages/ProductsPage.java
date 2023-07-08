package com.CompanyName.pages;

import com.CompanyName.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title']")
    public WebElement productsHeader;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    public WebElement backpackButton;

    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
    public WebElement fleeceJacketButton;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement addToCartBackpack;

    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    public WebElement shoppingCartWithItems;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    public WebElement addToCartOnesie;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    public WebElement dropdownButton;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    public WebElement logoutButton;

    public void click(WebElement title){
        title.click();
    }


}
