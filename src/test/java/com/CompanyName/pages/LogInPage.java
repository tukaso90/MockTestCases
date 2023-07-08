package com.CompanyName.pages;

import com.CompanyName.utilities.BrowserUtils;
import com.CompanyName.utilities.ConfigurationReader;
import com.CompanyName.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement userNameInputBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement logInButton;

    public void logIn(String userName,String password){
        userNameInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password);
        logInButton.click();
    }

    @FindBy(css = "h3[data-test='error']")
    public WebElement errorMessage;











}
