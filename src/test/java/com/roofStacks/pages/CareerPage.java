package com.roofStacks.pages;

import com.roofStacks.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CareerPage extends BasePage {

    public void clickOpenPositions(String text) {
        try {
            Driver.getDriver().findElement(By.xpath("//h3[text()='" + text + "']/..//a")).click();
        } catch (RuntimeException e) {
            System.out.println("The link is not found!");
        }
    }
}
