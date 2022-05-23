package com.orangeBank.stepdefinitions;

import com.orangeBank.pages.SearchPage;
import com.orangeBank.utilities.ConfigurationReader;
import com.orangeBank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class searchStepDefinitions {

    SearchPage searchPage = new SearchPage();

    @Given("I am on the google page")
    public void iAmOnTheGooglePage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        searchPage.acepto.click();
    }

    @When("I search for {string} on goggle")
    public void iSearchForOnGoogle(String input) {
        searchPage.inputbox.sendKeys(input, Keys.ENTER);
    }

    @Then("I accept more than {double} results as OK")
    public void iAcceptMoreThanResultsAsOk(double input) {
        boolean flag=false;
     if(searchPage.getNumbersFromResult()>input){
         flag=true;
     }
         Assert.assertTrue("Results are not more than %s" + input, flag);
    }

    @Then("I accept less than {double} results as Not OK")
    public void iAcceptMoreThanResultsAsNotOk(double input) {
        boolean flag=false;
        if(searchPage.getNumbersFromResult()<input) {
            flag = true;
        }
            Assert.assertFalse("Results are less than %s" + input+ "Not Ok", flag);

    }

}
