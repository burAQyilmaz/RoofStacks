package com.roofStacks.step_definitions;

import com.roofStacks.pages.*;
import com.roofStacks.utilities.ConfigurationReader;
import com.roofStacks.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CareerSendCV_SD {
    GooglePage googlePage = new GooglePage();
    BasePage basePage = new BasePage();
    CareerPage careerPage = new CareerPage();
    OpenPositionPage openPositionPage = new OpenPositionPage();
    RoofStacksOpenPositionPage roofStacksOpenPositionPage = new RoofStacksOpenPositionPage();
    SeniorMobileDevPage seniorMobileDevPage = new SeniorMobileDevPage();
    ApplicationPage applicationPage = new ApplicationPage();

    @Given("user goes to the google home page")
    public void user_goes_to_the_google_home_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("user enters {string} into the search box and hit the enter")
    public void user_enters_into_the_search_box_and_hit_the_enter(String string) {
        googlePage.googleInput.sendKeys(string, Keys.ENTER);
    }

    @When("clicks {string} link from result list")
    public void clicks_link_from_result_list(String string) {
        for (WebElement each : googlePage.resultLinks) {
            if (each.getText().equals(string)) {
                each.click();
                break;
            }
        }
    }

    @When("clicks the {string} page link")
    public void clicks_the_page_link(String string) {
        for (WebElement each : basePage.navBarLinks) {
            if (each.getText().equals(string)) {
                each.click();
                break;
            }
        }
    }

    @When("clicks Open Positions under {string} title")
    public void clicks_open_positions_under_title(String string) {
        careerPage = new CareerPage();
        careerPage.clickOpenPositions(string);
    }

    @When("clicks {string} tab")
    public void clicks_tab(String string) {

        for (WebElement label : openPositionPage.labels) {
            if (label.getText().equals(string)) {
                label.click();
                break;
            }
        }
    }

    @When("clicks View Job button near the {string}")
    public void clicks_view_job_button_near_the(String string) {
        for (WebElement jobTitle : roofStacksOpenPositionPage.jobTitles) {
            if (jobTitle.getText().equals(string)) {
                jobTitle.click();
                break;
            }
        }
    }

    @Then("user sees {string} title of page")
    public void user_sees_title_of_page(String string) {
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }

    @When("user clicks apply button")
    public void user_clicks_apply_button() {
        seniorMobileDevPage.applyButton.click();
    }

    @When("enter full name {string}, email address {string} and phone number {string}")
    public void enter_full_name_email_address_and_phone_number(String name, String email, String phone) {
        applicationPage.fullNameInput.sendKeys(ConfigurationReader.getProperty(name));
        applicationPage.emailAddressInput.sendKeys(ConfigurationReader.getProperty(email));
        applicationPage.phoneNumberInput.sendKeys(ConfigurationReader.getProperty(phone));

    }

    @When("upload a sample CV or resume")
    public void upload_a_sample_cv_or_resume()  {

        applicationPage.cvResumeUpload.sendKeys("C:\\Users\\Victus\\Desktop\\jobs\\Burak_Yilmaz_SDET.pdf");

    }

    @When("clicks send button")
    public void clicks_send_button() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,750)", "");
        applicationPage.sendButton.click();
    }

    @Then("user sees {string} message")
    public void user_sees_message(String string) {
        Assert.assertEquals(string, applicationPage.allDoneMessage.getText());
    }
}
