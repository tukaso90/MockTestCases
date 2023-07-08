package com.CompanyName.step_definitions;

import com.CompanyName.pages.LogInPage;
import com.CompanyName.pages.ProductsPage;
import com.CompanyName.utilities.ConfigurationReader;
import com.CompanyName.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogIn {

    ProductsPage pp = new ProductsPage();
    LogInPage lip = new LogInPage();

    @Given("user is already on the log in page")
    public void user_is_already_on_the_log_in_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
    }
    @When("user puts correct username and password and clicks Login button")
    public void user_puts_correct_username_and_password_and_clicks_login_button() {
        lip.logIn(ConfigurationReader.getProperty("correctUserName"),ConfigurationReader.getProperty("correctPassword"));

    }
    @Then("user should see {string} page")
    public void user_should_see_page(String header) {
        Assert.assertEquals(header,pp.productsHeader.getText());
    }


    @When("user puts locked out username and password and clicks Login button")
    public void user_puts_locked_out_username_and_password_and_clicks_login_button() {
        lip.logIn(ConfigurationReader.getProperty("lockedOutUser"),ConfigurationReader.getProperty("correctPassword"));
    }
    @Then("user should {string} message")
    public void user_should_message(String errorMessage) {
        Assert.assertEquals(errorMessage,lip.errorMessage.getText());
    }

    @When("user puts incorrect username and correct password and clicks Login button")
    public void user_puts_incorrect_username_and_correct_password_and_clicks_login_button() {
        lip.logIn((ConfigurationReader.getProperty("correctUserName")+1),ConfigurationReader.getProperty("correctPassword"));
    }
    @Then("user should see {string} message")
    public void user_should_see_message(String errorMessage) {
        Assert.assertEquals(errorMessage,lip.errorMessage.getText());
    }

    @When("user puts correct username and incorrect password and clicks Login button")
    public void user_puts_correct_username_and_incorrect_password_and_clicks_login_button() {
        lip.logIn(ConfigurationReader.getProperty("correctUserName"),(ConfigurationReader.getProperty("correctPassword"))+'#');
    }







}
