package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.testBase;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class MyStepdefs extends testBase{

    //@Before
   // public void setup() throws IOException{
   //     initialize();
   // }


    @Given("^I am on mendeley home page$")
    public void iAmOnMendeleyHomePage() throws Throwable {
        //driver.get(CONFIG.getProperty("sitename"));
        driver = new ChromeDriver();
        driver.navigate().to("https://www.mendeley.com/");
    }

    @When("^I click Create account button$")
    public void iClickCreateAccountButton() throws Throwable {
        driver.findElement(By.linkText("Create account")).click();

    }

    @Then("^I am taken to create account page$")
    public void iAmTakenToCreateAccountPage() throws Throwable {
        Thread.sleep(3000);

    }

    @And("^I enter email \"([^\"]*)\" in email field$")
    public void iEnterEmailInEmailField(String email) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(email);

    }

    @And("^I enter first name \"([^\"]*)\" in first name field$")
    public void iEnterFirstNameInFirstNameField(String firstname) throws Throwable {
        driver.findElement(By.id("first_name")).sendKeys(firstname);

    }

    @And("^I enter last name \"([^\"]*)\" in last name field$")
    public void iEnterLastNameInLastNameField(String lastname) throws Throwable {
        driver.findElement(By.id("last_name")).sendKeys(lastname);

    }

    @And("^I enter password \"([^\"]*)\" in password field$")
    public void iEnterPasswordInPasswordField(String password) throws Throwable {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("^I Click on the continue button$")
    public void iClickOnTheContinueButton() throws Throwable {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
    }

    @When("^I select field of study$")
    public void i_select_field_of_study() throws Throwable {
        driver.findElement(By.id("subject_area")).click();
        new Select(driver.findElement(By.id("subject_area"))).selectByVisibleText("Computer Science");
        driver.findElement(By.cssSelector("option[value=\"Computer Science\"]")).click();
    }

    @When("^I select academics$")
    public void i_select_academics() throws Throwable {
        driver.findElement(By.id("user_role")).click();
        new Select(driver.findElement(By.id("user_role"))).selectByVisibleText("Student > Master");
        driver.findElement(By.cssSelector("option[value=\"Student  > Master\"]")).click();
    }

    @When("^I click submit button to join$")
    public void i_click_submit_button_to_join() throws Throwable {
        driver.findElement(By.id("join-form-submit")).click();
    }

}
