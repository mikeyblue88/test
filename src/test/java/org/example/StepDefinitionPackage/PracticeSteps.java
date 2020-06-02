package org.example.StepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Practice;

public class PracticeSteps {
Practice practice = new Practice();


    @Given("^user is on the homepage$")
    public void user_is_on_the_homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user types in Nike$")
    public void user_types_in_Nike() throws Throwable {
        practice.dosearch();
        practice.doclick();
    }

    @Then("^user should see all products related to Nike$")
    public void user_should_see_all_products_related_to_Nike() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
