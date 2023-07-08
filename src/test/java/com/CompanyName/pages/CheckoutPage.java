package com.CompanyName.pages;

import com.CompanyName.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement firstNameInputBox;

    @FindBy(xpath = "//input[@id='last-name']")
    public WebElement lastNameInputBox;

    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElement zipCodeInputBox;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//button[@id='finish']")
    public WebElement finishButton;

    @FindBy(xpath = "//h2[normalize-space()='Thank you for your order!']")
    public WebElement confirmationText;

    @FindBy(css = "h3[data-test='error']")
    public WebElement errorMessage;

    public void sendText(String firstName, String lastName, String zipCode){
        firstNameInputBox.sendKeys(firstName);
        lastNameInputBox.sendKeys(lastName);
        zipCodeInputBox.sendKeys(zipCode);
    }






}
