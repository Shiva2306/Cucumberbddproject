package nammastepdefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;
import orangeHRMPages.NamLoginPage;

public class NammaLogin extends BaseClass {

    private NamLoginPage loginpage;

    @Given("I am on the OrangeHRM login page")
    public void i_am_on_the_orange_hrm_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginpage = new NamLoginPage(driver);
    }

    @Given("I have entered a valid username and password")
    public void i_have_entered_a_valid_username_and_password() {
        loginpage.username("Admin");
        loginpage.password("admin123");
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        loginpage.clbtn();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

    @Given("I have entered invalid {string} and {string}")
    public void i_have_entered_invalid_and(String user, String pass) {
        loginpage.username(user);
        loginpage.password(pass);
    }

    @Then("I should see an error message indicating {string}")
    public void i_should_see_an_error_message_indicating(String string) {
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).isDisplayed());
    }
}
