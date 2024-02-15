package com.roofStacks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPage extends BasePage{

    @FindBy(id = "6")
    public WebElement fullNameInput;

    @FindBy(id = "7")
    public WebElement emailAddressInput;

    @FindBy(css = ".PhoneInputInput")
    public WebElement phoneNumberInput;

    @FindBy(id = "3")
    public WebElement cvResumeUpload;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendButton;

    @FindBy(css = ".KlYKX")
    public WebElement allDoneMessage;
}
