package com.orangeBank.pages;

import com.orangeBank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    public SearchPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "L2AGLb")
    public WebElement acepto;

    @FindBy(css = ".gLFyf.gsfi")
    public WebElement inputbox;

    @FindBy(id = "result-stats")
    public WebElement resultsOfSearch;

    public double getNumbersFromResult(){
        String results=resultsOfSearch.getText().replaceAll("[^0-9]","");
        double number= Double.parseDouble(results);
        return number;
    }

}
