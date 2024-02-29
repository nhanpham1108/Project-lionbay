package stepDefinitions;

import browsers.Hook;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class OrderSteps {

    public WebDriver driver;

    public OrderSteps() {
        driver = Hook.driver;
    }

    @When("Single created button = {string}")
    public void created_order(String createdOrder) throws Throwable {
        WebElement createdOrderElement = driver.findElement(By.xpath("//*[text()=\"" + createdOrder + "\"]"));
        createdOrderElement.click();
        Thread.sleep(1000);
    }

    @When("Fullname = {string}")
    public void Fullname(String Fullname) throws Throwable {
        WebElement FullnameElement = driver.findElement(By.xpath("(//input[@name=\"name\"])"));
        FullnameElement.click();
        FullnameElement.sendKeys(Fullname);
        Thread.sleep(1000);
    }


    @When("Phone = {word}")
    public void Phone(String Phone) throws Throwable {
        WebElement PhoneElement = driver.findElement(By.xpath("(//input[@name=\"phone\"])"));
        PhoneElement.click();
        PhoneElement.sendKeys(Phone);
        Thread.sleep(1000);
    }



    @When("City = {word}")
    public void City(String city) throws Throwable {
        WebElement cityElement = driver.findElement(By.xpath("(//input[@name=\"city\"])"));
        cityElement.click();
        cityElement.sendKeys(city);
        Thread.sleep(1000);
    }


    @When("Address1 = {string}")
    public void Address1(String Address1) throws Throwable {
        WebElement Address1Element = driver.findElement(By.xpath("(//input[@name=\"address\"])[1]"));
        Address1Element.click();
        Address1Element.sendKeys(Address1);
        Thread.sleep(1000);
    }


    @When("Address2 = {string}")
    public void Address2(String Address2) throws Throwable {
        WebElement Address2Element = driver.findElement(By.xpath("(//input[@name=\"address\"])[2]"));
        Address2Element.click();
        Address2Element.sendKeys(Address2);
        Thread.sleep(1000);
    }

    @When("State = {word}")
    public void State(String State) throws Throwable {
        WebElement StateElement = driver.findElement(By.xpath("(//input[@name=\"state\"])"));
        StateElement.click();
        StateElement.sendKeys(State);
        Thread.sleep(1000);
    }


    @When("Zipcode = {word}")
    public void Zipcode(String Zipcode) throws Throwable {
        WebElement ZipcodeElement = driver.findElement(By.xpath("(//input[@name=\"postcode\"])"));
        ZipcodeElement.click();
        ZipcodeElement.sendKeys(Zipcode);
        Thread.sleep(1000);
    }
    @When("Countrycode = {word}")
    public void Countrycode(String Countrycode) throws Throwable {
        WebElement CountrycodeElement = driver.findElement(By.xpath("(//input[@name=\"countrycode\"])"));
        CountrycodeElement.click();
        CountrycodeElement.sendKeys(Countrycode);
        Thread.sleep(1000);
    }

    @When("Ordernumber = {word}")
    public void Ordernumber(String Ordernumber) throws Throwable {
        WebElement OrdernumberElement = driver.findElement(By.xpath("(//input[@name=\"order_number\"])"));
        OrdernumberElement.click();
        OrdernumberElement.sendKeys(Ordernumber);
        Thread.sleep(1000);
    }

    @When("Detail = {string}")
    public void Detail(String Detail) throws Throwable {
        WebElement DetailElement = driver.findElement(By.xpath("(//input[@name=\"detail\"])"));
        DetailElement.click();
        DetailElement.sendKeys(Detail);
        Thread.sleep(1000);
    }

    @When("Weight = {word}")
    public void Weight(String Weight) throws Throwable {
        WebElement WeightElement = driver.findElement(By.xpath("(//input[@name=\"weight\"])"));
        WeightElement.click();
        WeightElement.sendKeys(Weight);
        Thread.sleep(1000);
    }

    @When("Length = {word}")
    public void Length(String Length) throws Throwable {
        WebElement LengthElement = driver.findElement(By.xpath("(//input[@name=\"length\"])"));
        LengthElement.click();
        LengthElement.sendKeys(Length);
        Thread.sleep(1000);
    }

    @When("Width = {word}")
    public void Width(String Width) throws Throwable {
        WebElement WidthElement = driver.findElement(By.xpath("(//input[@name=\"width\"])"));
        WidthElement.click();
        WidthElement.sendKeys(Width);
        Thread.sleep(1000);
    }

    @When("Height = {word}")
    public void Height(String Height) throws Throwable {
        WebElement HeightElement = driver.findElement(By.xpath("(//input[@name=\"height\"])"));
        HeightElement.click();
        HeightElement.sendKeys(Height);
        Thread.sleep(1000);
    }

    @When("Pin")
    public void Pin() throws Throwable {
        WebElement PinElement = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])"));
        PinElement.click();
        Thread.sleep(1000);
    }

    @When("Service = {string}")
    public void Service(String Service) throws Throwable {
        WebElement ServiceListElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[2]/div/div/div"));
        ServiceListElement.click();
        WebElement ServiceElement = driver.findElement(By.xpath("//*[text()=\"" + Service + "\"]"));
        ServiceElement.click();
        Thread.sleep(1000);
    }

    @When("New create button")
    public void New_create_button() throws Throwable {
        WebElement NewCreateButtonListElement = driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]"));
        NewCreateButtonListElement.click();
        Thread.sleep(1000);
    }

    @When("Import excel = {string}")
    public void Import_excel(String Import ) throws Throwable {
        WebElement NewCreateButtonListElement = driver.findElement(By.xpath("//*[text()=\"" + Import + "\"]"));
        NewCreateButtonListElement.click();
        Thread.sleep(1000);
    }

    @When("Upload file US")
    public void Upload_file_US() throws Throwable {
        WebElement NewCreateButtonListElement = driver.findElement(By.xpath("(//input[@type=\"file\"])"));
        String filePath = "D:\\kho\\Lionbay\\File_Autotest\\Zone 1_auto.xlsx";
        NewCreateButtonListElement.sendKeys(filePath);
        WebElement uploadElement = driver.findElement(By.xpath("(//button[@class=\"p-button btn btn-primary\"])"));
        uploadElement.click();
        Thread.sleep(1000);
    }


    @When("Select multiple orders")
    public void multiple_orders() throws Throwable {
        WebElement Orders1Element = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
        Orders1Element.click();
        WebElement Orders2Element = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
        Orders2Element.click();
        Thread.sleep(1000);
    }

    @Then("Order details screen = {string}")
    public void alert_email(String text) throws Throwable {
        WebElement e = driver.findElement(By.xpath("//div[@class=\"title\"]"));
        assertEquals(e.getText(), text);

    }

    @Then("Text successfully")
    public void Text_successfully() throws Throwable {
        WebElement TotalOrderElement = driver.findElement(By.xpath("//*[@id=\"preview\"]/div[2]/div/div[2]/table/tr[2]/td[2]"));
        WebElement OrderSuccessfulElement = driver.findElement(By.xpath("//*[@id=\"preview\"]/div[2]/div/div[2]/table/tr[3]/td[2]"));

        if (TotalOrderElement.getText().equals(OrderSuccessfulElement.getText())){
            System.out.println("Tất cả các đơn đều import thành công");
        }
        else  {
            System.out.println("File import có đơn lỗi");
        }


    }




}
