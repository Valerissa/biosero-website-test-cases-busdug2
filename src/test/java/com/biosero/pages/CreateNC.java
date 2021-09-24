package com.biosero.pages;


import com.biosero.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNC {


 public CreateNC(){


     PageFactory.initElements(Driver.getDriver(), this);


 }

@FindBy(xpath = "//a[@id='add']")
public WebElement addComp;

 @FindBy(xpath = "//input[@id='name']")
public WebElement compName;

@FindBy(xpath = "//input[@id='introduced']")
    public WebElement inDate;

@FindBy(xpath = "//input[@id='discontinued']")
    public WebElement disDate;

@FindBy(xpath = "//select[@id='company']")
    public WebElement dropDown;

@FindBy(xpath = "//input[@value='Create this computer']")
    public WebElement crButton;

@FindBy(id = "searchbox")
    public WebElement searchBar;

@FindBy(id="searchsubmit")
    public WebElement filterButton;

@FindBy (xpath = "//td/a")
    public WebElement compLink;












}
