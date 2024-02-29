package stepDefinitions;

import browsers.Hook;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class SignupSteps {
    public WebDriver driver;

    public SignupSteps() {
        driver = Hook.driver;
    }

    @When("Ten tai khoan = {string}")
    public void Ten_tai_khoan(String tentk) throws Throwable {
        WebElement e = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
        e.clear();
        e.sendKeys(tentk);
        Thread.sleep(1000);
    }

    @When("Quy mo = {string}")
    public void Quy_mo(String Quymo) throws Throwable {
        WebElement e = driver.findElement(By.xpath("//div[@class=\"multiselect__select\"]"));
        e.click();
        Thread.sleep(1000);
        WebElement e1 = driver.findElement(By.xpath("//*[text()=\"" + Quymo + "\"]"));
        e1.click();
        Thread.sleep(1000);
    }

    @When("Sdt = {string}")
    public void Sdt(String sdt) throws Throwable {
        WebElement e = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
        e.clear();
        e.sendKeys(sdt);
        Thread.sleep(1000);

    }

    @When("Set email = {word}")
    public void email(String email) throws Throwable {
        WebElement e = driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
        e.clear();
        e.sendKeys(email);
        Thread.sleep(1000);

    }

    @When("Ten tai khoan = {word}")
    public void tentk(String ten) throws Throwable {
        WebElement e = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
        e.clear();
        e.sendKeys(ten);
        Thread.sleep(1000);

    }


    @When("Click button signup")
    public void signup() throws Throwable {
        WebElement e = driver.findElement(By.xpath("//button[@type=\"button\"]"));
        e.click();
        Thread.sleep(6000);

    }


    @When("Sdt auto")
    public void Sdt_auto() throws Throwable {
        WebElement e = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
        e.click();
        int currentTimeMillisInt = -1 * (int) System.currentTimeMillis();
        e.sendKeys(String.valueOf(currentTimeMillisInt));
        Thread.sleep(6000);

    }


    @When("Email auto")
    public void Email_auto() throws Throwable {
        WebElement e = driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
        e.click();
        int currentTimeMillisInt = -1 * (int) System.currentTimeMillis();
        e.sendKeys(String.valueOf(currentTimeMillisInt) + "@yopmail.com");

        Thread.sleep(6000);

    }

    @Then("alert email = {string}")
    public void alert_email(String text) throws Throwable {
        WebElement e = driver.findElement(By.xpath("//span[@class=\"helper-text\"]"));
        assertEquals(e.getText(), text);

    }



    @Then("kiemtraemail = {string}")
    public void kiemtraemail(String text) throws Throwable {
        WebElement e1 = driver.findElement(By.xpath("//p[@class=\"alert active error\"]"));
        assertEquals(e1.getText(), text);
    }


    @Then("alert hoten = {string}")
    public void alert_hoten(String text) throws Throwable {
        WebElement e1 = driver.findElement(By.xpath("//p[@class=\"alert active error\"]"));
        assertEquals(e1.getText(), text);
    }


    @Then("kiemtra = {string}")
    public void kiemtra(String text) throws Throwable {
        WebElement e1 = driver.findElement(By.xpath("//div[@class=\"text-center request-noti\"]"));
        assertEquals(e1.getText(), text);
    }










}
