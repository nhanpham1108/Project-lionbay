package stepDefinitions;

import browsers.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class TopupSteps {


    public WebDriver driver;

    public TopupSteps() {
        driver = Hook.driver;
    }


    @When("Recharge tab")
    public void Recharge_tab() throws Throwable {
        WebElement RechargeElement = driver.findElement(By.xpath("(//a[@href=\"javascript:void(0)\"])[1]"));
        RechargeElement.click();
        Thread.sleep(10000);


    }

    public float walletValueold;
    public float walletValuenew;

    @When("Check wallet")
    public void Check_wallet() throws Throwable {

        WebElement balanceElement = driver.findElement(By.xpath("(//p[@class=\"money\"])[1]"));
        WebElement debtElement = driver.findElement(By.xpath("(//p[@class=\"money\"])[2]"));

        String balanceText = balanceElement.getText();
        String newText = balanceText.substring(1);// lấy sau ký tự $
        float balanceFloat = Float.parseFloat(newText);


        String debtText = debtElement.getText();
        String debNewText = debtText.substring(1);
        String cleanDebNewText = debNewText.replace(",", "");
        String[] debtList = cleanDebNewText.split("\\(");
        float debtFloat = Float.parseFloat(debtList[0]);


        if (balanceFloat > debtFloat) {
            walletValueold = balanceFloat;
        } else if (balanceFloat == debtFloat) {
            walletValueold = balanceFloat;
        } else {
            walletValueold = debtFloat * -1;
        }

    }

    @When("Click transfer")
    public void Click_transfer() throws Throwable {
        WebElement transferElement = driver.findElement(By.xpath("(//a[@href=\"javascript:void(0)\"])[6]"));
        transferElement.click();
        Thread.sleep(1000);

    }

    @When("Click payoner")
    public void Click_payoner() throws Throwable {
        WebElement payonerElement = driver.findElement(By.xpath("(//a[@href=\"javascript:void(0)\"])[7]"));
        payonerElement.click();
        Thread.sleep(1000);

    }

    @When("Click pingpong")
    public void Click_pingpong() throws Throwable {
        WebElement pingpongElement = driver.findElement(By.xpath("(//a[@href=\"javascript:void(0)\"])[8]"));
        pingpongElement.click();
        Thread.sleep(1000);

    }

    @When("Transation = {word}")
    public void Transation(String transation) throws Throwable {
        WebElement transationElement = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        transationElement.click();
        transationElement.sendKeys(transation);
        Thread.sleep(1000);

    }


    @When("Enter money = {word}")
    public void Enter_money(String money) throws Throwable {
        WebElement moneyElement = driver.findElement(By.xpath("//input[@id=\"money\"]"));
        moneyElement.click();
        moneyElement.sendKeys(money);
        Thread.sleep(1000);
    }

    @When("Confirm transfer")
    public void Confirm_transfer() throws Throwable {
        WebElement ConfirmTransferElement = driver.findElement(By.xpath("//button[@type=\"button\"]"));
        ConfirmTransferElement.click();
        Thread.sleep(1000);
    }


    @When("And go to page {word}")
    public void go_to_page(String page) throws Throwable {
        driver.get(page);
    }

    @When("Set username admin = {word}")
    public void set_username_admin(String username) throws Throwable {
        WebElement UsernameAdminElement = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        UsernameAdminElement.clear();
        UsernameAdminElement.sendKeys(username);
    }

    @When("Set password admin = {word}")
    public void set_password_admin(String password) throws Throwable {
        WebElement passwordAdminElement = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        passwordAdminElement.clear();
        passwordAdminElement.sendKeys(password);
    }

    @When("Login admin")
    public void click_login_admin() throws Throwable {
        WebElement loginAdminElement = driver.findElement(By.xpath("//button[@type=\"button\"]"));
        loginAdminElement.click();
        Thread.sleep(2000);
    }

    @When("Search for emails on topup = {word}")
    public void Search_emails(String SearchEmails) throws Throwable {
        WebElement SearchEmailElement = driver.findElement(By.xpath("//input[@class=\"p-input-search p-input form-control\"]"));
        SearchEmailElement.click();
        SearchEmailElement.clear();
        SearchEmailElement.sendKeys(SearchEmails);
        SearchEmailElement.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @When("Admin confirms topup")
    public void confirms_topup() throws Throwable {
        WebElement ConfirmsTopupElement = driver.findElement(By.xpath("(//button[@class=\"mr-2 p-button btn btn-info\"])[1]"));
        ConfirmsTopupElement.click();
        WebElement ConfirmsTopupYesElement = driver.findElement(By.xpath("//button[@class=\"p-button btn btn-info\"]"));
        ConfirmsTopupYesElement.click();
        Thread.sleep(2000);
    }


    @Then("vi")
    public void vi() throws Throwable {
        WebElement balanceElement = driver.findElement(By.xpath("(//p[@class=\"money\"])[1]"));
        WebElement debtElement = driver.findElement(By.xpath("(//p[@class=\"money\"])[2]"));

        String balanceText = balanceElement.getText();
        String newText = balanceText.substring(1);// lấy sau ký tự $
        float balanceFloat = Float.parseFloat(newText);


        String debtText = debtElement.getText();
        String debNewText = debtText.substring(1);
        String cleanDebNewText = debNewText.replace(",", "");
        String[] debtList = cleanDebNewText.split("\\(");
        float debtFloat = Float.parseFloat(debtList[0]);


        if (balanceFloat > debtFloat) {
            walletValuenew = balanceFloat;
        } else if (balanceFloat == debtFloat) {
            walletValuenew = balanceFloat;
        } else {
            walletValuenew = debtFloat * -1;
        }
        System.out.println(walletValuenew);
        System.out.println(walletValueold);


        if (walletValuenew == walletValueold + 1000) {
            System.out.println("Ví cộng tiền đúng!");
        } else {
            System.out.println("Ví cộng tiền sai!");
        }
        assertEquals(walletValuenew, walletValueold + 10000);


    }



}



