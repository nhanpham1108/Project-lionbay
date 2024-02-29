package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import browsers.Hook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class LoginSteps {

    public WebDriver driver;

    public LoginSteps() {
        driver = Hook.driver;
    }

    @Given("Go to page {word}")
    public void go_to_page(String page) throws Throwable {
        driver.get(page);
    }

    @When("Set username = {word}")
    public void set_username(String username) throws Throwable {
        WebElement e = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        e.clear();
        e.sendKeys(username);
    }

    @When("Set password = {word}")
    public void set_password(String password) throws Throwable {
        WebElement e = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        e.clear();
        e.sendKeys(password);
    }

    @When("Click button login")
    public void click_login() throws Throwable {
        WebElement e = driver.findElement(By.xpath("//button[@type=\"button\"]"));
        e.click();
        Thread.sleep(2000);
    }

    @Then("Redirect to {word}")
    public void Redirect_to(String page) throws Throwable {
        String currentUrl = driver.getCurrentUrl();
        assertEquals(currentUrl,page );
    }

    @Then("Click logout")
    public void Click_logout() throws Throwable {
        WebElement e = driver.findElement(By.xpath("//span[@class=\"username\"]"));
        e.click();
        WebElement e1 = driver.findElement(By.xpath("//a[@href=\"/logout\"]"));
        e1.click();

    }



    @Then("Show headup alert = {string}")
    public void check_alert(String text) throws Throwable {
        WebElement e = driver.findElement(By.xpath("//div[@role=\"alert\"]"));
        assertEquals(e.getText(), text);
    }
}
