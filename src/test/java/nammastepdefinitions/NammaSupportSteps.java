package nammastepdefinitions;


import org.testng.Assert;
import io.cucumber.java.en.*;
import orangeHRMPages.DashboardPage;

public class NammaSupportSteps extends BaseClass {

    private DashboardPage dashboardPage;

    @When("I close any popup if present")
    public void i_close_any_popup_if_present() {
        dashboardPage = new DashboardPage(driver); // Initialize here
        dashboardPage.closePopupIfPresent();
    }

    @When("I click the profile dropdown")
    public void i_click_the_profile_dropdown() {
        dashboardPage.clickProfileDropdown();
    }

    @When("I click on Support link")
    public void i_click_on_support_link() {
        dashboardPage.clickSupport();
    }

    @Then("I should see text {string}")
    public void i_should_see_text(String expectedText) {
        Assert.assertTrue(dashboardPage.isGettingStartedTextVisible(),
                "Expected text was not found: " + expectedText);
    }
}
