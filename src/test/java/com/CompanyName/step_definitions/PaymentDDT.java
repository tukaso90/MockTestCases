package com.CompanyName.step_definitions;

import com.CompanyName.pages.CheckoutPage;
import com.CompanyName.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PaymentDDT {

    CheckoutPage cp = new CheckoutPage();
    ProductsPage pp = new ProductsPage();

    @When("the user puts {string}, {string} and {string}")
    public void the_user_puts_and(String firstName, String lastName, String zipCode) {
        cp.sendText(firstName,lastName,zipCode);
    }
    @When("the user clicks Continue button")
    public void the_user_clicks_continue_button() {
        pp.click(cp.continueButton);
    }
    @When("the user clicks on the Finish button")
    public void the_user_clicks_on_the_finish_button() {
        pp.click(cp.finishButton);
    }
    @Then("the user should see {string} note")
    public void the_user_should_see_note(String expectedConfirmationMessage) {
        Assert.assertEquals(expectedConfirmationMessage,cp.confirmationText.getText());
    }

    @Then("the screen should show {string}")
    public void the_screen_should_show(String expectedErrorMessage) {
        Assert.assertEquals(expectedErrorMessage, cp.errorMessage.getText());
    }








}
