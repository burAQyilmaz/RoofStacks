package com.roofStacks.pages;

import com.roofStacks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@class='gLFyf']")
    public WebElement googleInput;

    @FindBy(xpath = "//cite")
    public List<WebElement> resultLinks;


}
