package com.CompanyName.step_definitions;

import com.CompanyName.pages.CheckoutPage;
import com.CompanyName.pages.LogInPage;
import com.CompanyName.pages.ProductsPage;
import com.CompanyName.pages.ShoppingCart;
import com.CompanyName.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartVerification {

    ProductsPage pp = new ProductsPage();
    ShoppingCart sc = new ShoppingCart();
    LogInPage lip = new LogInPage();
    CheckoutPage cp = new CheckoutPage();


    @When("the user click on the Add to cart button of the Sauce Labs Backpack")
    public void the_user_click_on_the_add_to_cart_button_of_the_sauce_labs_backpack() {
        pp.click(pp.addToCartBackpack);
    }

    @Then("the cart will display number one")
    public void the_cart_will_display_number_one() {
        Assert.assertEquals("1",pp.shoppingCartWithItems.getText());
    }

    @When("the user clicks on the Add to cart button of the Sauce Labs Backpack")
    public void the_user_clicks_on_the_add_to_cart_button_of_the_sauce_labs_backpack() {
        pp.click(pp.addToCartBackpack);
    }

    @When("the user clicks on the Add to car button of the Sauce Labs Onesie")
    public void the_user_clicks_on_the_add_to_car_button_of_the_sauce_labs_onesie() {
        pp.click(pp.addToCartOnesie);
    }

    @Then("the cart will display number two")
    public void the_cart_will_display_number_two() {
        Assert.assertEquals("2",pp.shoppingCartWithItems.getText());

    }

    @When("clicks on the cart button")
    public void clicks_on_the_cart_button() {
        pp.click(pp.shoppingCart);
    }

    @Then("the {string} should appear in the cart")
    public void the_should_appear_in_the_cart(String expectedItem) {
        Assert.assertEquals(expectedItem,sc.inventoryItem.getText());
    }


    @When("the user clicks on the Remove button in the cart")
    public void the_user_clicks_on_the_remove_button_in_the_cart() {
        pp.click(sc.removeBackpackButton);
    }

    @When("clicks on the Continue Shopping button")
    public void clicks_on_the_continue_shopping_button() {
        pp.click(sc.continueShoppingButton);
    }

    @When("the user logouts")
    public void the_user_logouts() {
        pp.click(pp.dropdownButton);
        pp.click(pp.logoutButton);
    }
    @When("the user logs in again")
    public void the_user_logs_in_again() {
        lip.logIn(ConfigurationReader.getProperty("correctUserName"),ConfigurationReader.getProperty("correctPassword"));
    }

    @When("the user clicks on the Checkout button")
    public void the_user_clicks_on_the_checkout_button() {
        pp.click(sc.checkoutButton);
    }
    @When("the user clicks on the Cancel button")
    public void the_user_clicks_on_the_cancel_button() {
        pp.click(cp.cancelButton);
    }




}
