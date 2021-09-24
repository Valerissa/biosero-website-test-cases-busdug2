package com.biosero.step_definitions;

import com.biosero.pages.CreateNC;
import com.biosero.utilities.ConfigurationReader;
import com.biosero.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class CreateNewComputer {

     Faker faker = new Faker();
     CreateNC page = new CreateNC();
     String compName = faker.company().name().toLowerCase();



    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        String url = ConfigurationReader.getProperty("URL");
        Driver.getDriver().get(url);

    }


    @When("User clicks on \"Add a new computer\" button")
    public void user_clicks_on_button() {

        page.addComp.click();


    }
    @When("User types new computer name inside the search bar")
    public void user_types_new_computer_name_inside_the_search_bar() {

       page.compName.sendKeys(compName);


    }

    @When("User inserts introduction date as {string}")
    public void user_inserts_introduction_date_as(String string) {

       page.inDate.sendKeys(string);


    }
    @When("User inserts discontinued date as {string}")
    public void user_inserts_discontinued_date_in_required_format(String string) {

      page.disDate.sendKeys(string);


    }
    @When("User selects company name {string}")
    public void user_is_able_to_select_company_name (String string) {


        Select select = new Select(page.dropDown);
        select.selectByVisibleText(string);

    }
    @When("User clicks on \"Create this computer\" button")
    public void user_is_able_to_click_on_button() {


        page.crButton.click();

    }
    @Then("User is able to find new computer name in a search bar")
    public void user_is_able_to_find_new_computer_name_in_a_search_bar() {

      page.searchBar.sendKeys(compName);
      page.filterButton.click();



        System.out.println("New computer name is "+page.compLink.getText().toUpperCase());
        Assert.assertTrue(page.compLink.getText()==compName);



    }


}
