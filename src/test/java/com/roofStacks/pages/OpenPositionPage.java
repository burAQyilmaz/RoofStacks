package com.roofStacks.pages;

import com.roofStacks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OpenPositionPage extends BasePage {

    @FindBy(xpath = "//label")
    public List<WebElement> labels;


}
