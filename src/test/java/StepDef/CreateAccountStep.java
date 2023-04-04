package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.selenium.Hooks;

public class CreateAccountStep {

    public static WebDriver driver = Hooks.setUp();

    @Given("User go to web {string}")
    public void userGoToWeb(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);
    }

    @And("Input first name {string}")
    public void inputFirstName(String firstName) {
        WebElement inputFirstName = driver.findElement(By.xpath("//input[@id='signatory_first_name']"));
        inputFirstName.sendKeys(firstName);
    }

    @And("Input last name {string}")
    public void inputLastName(String lastName) {
        WebElement inputLastName = driver.findElement(By.xpath("//input[@id='signatory_last_name']"));
        inputLastName.sendKeys(lastName);
    }

    @And("Input email {string}")
    public void inputEmail(String email) {
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys(email);
    }

    @And("Input password {string}")
    public void inputPassword(String password) {
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys(password);
    }

    @And("Input company name {string}")
    public void inputCompanyName(String companyName) {
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(companyName);
    }

    @And("Input no telepon {string}")
    public void inputNoTelepon(String telepon) {
        driver.findElement(By.xpath("//input[@placeholder='812-345-678']")).sendKeys(telepon);
    }

    @And("Select country")
    public void selectCountry() {
        driver.findElement(By.xpath("//select[@id='country']")).click();
        driver.findElement(By.xpath("//option[@value='9']")).click();

    }

    @And("Click box accept service aggrement")
    public void clickBocAcceptServiceAggrement() {
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

    }

    @And("Click button next step")
    public void clickButtonNextStep() {
        driver.findElement(By.xpath("//button[@id='btn-register']")).click();
    }

    @Then("Should successfully createt account")
    public void shouldSuccessfullyCreatetAccount() {
       Assert.assertTrue(driver.findElement(By.xpath("//div[@id='success-mob']")).isDisplayed());
    }

    @And("Without input first name")
    public void withoutInputFirstName() {
        System.out.println("null");
        driver.findElement(By.xpath("//input[@id='signatory_first_name']")).click();
    }

    @And("Without input last name")
    public void inputLastName() {
        System.out.println("null");
        driver.findElement(By.xpath("//input[@id='signatory_last_name']")).click();
    }

    @And("Without input password")
    public void withoutInputPassword() {
        System.out.println("null");
        driver.findElement(By.xpath("//input[@id='password']")).click();
    }

    @And("Without input company name")
    public void withoutInputCompanyName() {
        System.out.println("null");
        driver.findElement(By.xpath("//input[@id='name']")).click();
    }
}
