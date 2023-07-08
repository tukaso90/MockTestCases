package com.CompanyName.step_definitions;

import com.CompanyName.pages.BackpackPage;
import com.CompanyName.pages.FleeceJacketPage;
import com.CompanyName.pages.LogInPage;
import com.CompanyName.pages.ProductsPage;
import com.CompanyName.utilities.ConfigurationReader;
import com.CompanyName.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class VerifyProduct {

    LogInPage lip = new LogInPage();
    ProductsPage pp = new ProductsPage();
    BackpackPage bp = new BackpackPage();
    FleeceJacketPage fjp = new FleeceJacketPage();


    @Given("user is already on the log in page and logged with valid username and password")
    public void user_is_already_on_the_log_in_page_and_logged_with_valid_username_and_password() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));
        lip.logIn(ConfigurationReader.getProperty("correctUserName"),ConfigurationReader.getProperty("correctPassword"));
    }
    @When("user click on the Backpack title")
    public void user_click_on_the_backpack_title() {
        pp.click(pp.backpackButton);
    }

    @Then("the price should match {string}")
    public void the_price_should_match(String expectedPrice) {
        Assert.assertEquals(expectedPrice,bp.backpackPrice.getText());
    }
    @Then("the product title should match {string}")
    public void the_product_title_should_match(String expectedTitle) {
        Assert.assertEquals(expectedTitle,bp.backpackTitle.getText());
    }

    @Then("Add to cart button should be visible")
    public void addToCartButtonShouldBeVisible() {
        Assert.assertTrue(bp.addToCartButton.isDisplayed());
    }

    @When("user click on the fleece jacket title")
    public void user_click_on_the_fleece_jacket_title() {
        pp.click(pp.fleeceJacketButton);
    }
    @Then("the price should be {string}")
    public void the_price_should_be(String expectedPrice) {
        Assert.assertEquals(expectedPrice,fjp.fleeceJacketPrice.getText());
    }
    @Then("the product title should be {string}")
    public void the_product_title_should_be(String expectedTitle) {
        Assert.assertEquals(expectedTitle, fjp.fleeceJacketTitle.getText());
    }
    @Then("AddToCart button should be visible")
    public void add_to_cart_button_should_be_visible() {
        Assert.assertTrue(fjp.addToCartButton.isDisplayed());
    }








}
