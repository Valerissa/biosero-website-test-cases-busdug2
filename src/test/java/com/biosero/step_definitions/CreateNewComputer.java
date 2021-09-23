package com.biosero.step_definitions;

import com.biosero.pages.CreateNC;
import com.biosero.utilities.ConfigurationReader;
import com.biosero.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class CreateNewComputer {

     Faker faker = new Faker();

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        String url = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(url);

    }


    @When("User clicks on {string} button in the right top corner")
    public void user_clicks_on_button_in_the_right_top_corner(String string) {
        CreateNC createNC = new CreateNC();
        createNC.addComp.click();


    }
    @When("User types new computer name inside the search bar")
    public void user_types_new_computer_name_inside_the_search_bar() {
       CreateNC createNC = new CreateNC();
       createNC.compName.sendKeys(faker.company().name().toLowerCase());


    }
    @When("User inserts introduction date in required date format bar")
    public void user_inserts_introduction_date_in_required_date_format_bar() {

        CreateNC createNC = new CreateNC();




    }
    @When("User inserts discontinued date in required format")
    public void user_inserts_discontinued_date_in_required_format() {


    }
    @When("User is able to select company name from provided dropdown")
    public void user_is_able_to_select_company_name_from_provided_dropdown() {
     CreateNC createNC = new CreateNC();
        Select select = new Select(createNC.dropDown);
        select.selectByVisibleText("Nokia");







    }
    @When("User is able to click on {string} button")
    public void user_is_able_to_click_on_button(String string) {



    }
    @Then("User should see alert \"Done!Computer has been created")
    public void user_should_see_alert_done_computer_has_been_created() {

    }















}
