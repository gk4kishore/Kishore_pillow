package seleniumgluecode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseClass.BrowserSetup;
import PageObjectRepository.Successful_Payment;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentFunctionalityTest extends BrowserSetup {
	
	static WebDriver driver;
	Successful_Payment SP;
	static Logger log = Logger.getLogger(PaymentFunctionalityTest.class.getName());
	
	@When("^User open demo midtrans website$")
	public void user_open_demo_midtrans_website() throws Throwable {
		String current = System.getProperty("user.dir");
		System.out.println("Current working directory in Java : " + current);
		File file = new File(System.getProperty("user.dir") + "\\config\\Details.properties");
		FileInputStream fileInput = null;
		try {
		fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
		prop.load(fileInput);
		} catch (IOException e) {
		e.printStackTrace();
		}
		driver = BrowserSetup.StartBrowser(prop.getProperty("BrowserType") ,prop.getProperty("Url"));
		log.info("Application launched");
	}

	@Then("^User clicks on Buy button$")
	public void user_clicks_on_Buy_button() throws Throwable {
		SP = new Successful_Payment(driver);
		SP.ClickOnBuyButton();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	    
	}

	@Then("^User clicks on CheckOut button$")
	public void user_clicks_on_CheckOut_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.ClickOnCartCheckoutButton();
	    
	}

	@Then("^User clicks on Continue button$")
	public void user_clicks_on_Continue_button() throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP.ClickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}

	@Then("^User select credit card option$")
	public void user_select_credit_card_option() throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP.TapCardButton("Credit/Debit Card");
		SP.ClickOnTapingCardButton();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}

	@Then("^User enters valid Card Number \"([^\"]*)\"$")
	public void user_enters_valid_Card_Number(String strCardNumber) throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.setCardNumber(strCardNumber);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}

	@Then("^User enters valid Expiry Date \"([^\"]*)\"$")
	public void user_enters_valid_Expiry_Date(String strExpiryDate) throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.setExpiryDate(strExpiryDate);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	    
	}

	@Then("^User enters valid CVV Number \"([^\"]*)\"$")
	public void user_enters_valid_CVV_Number(String strCVVNumber) throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.setCVVNumber(strCVVNumber);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	    
	}

	@Then("^User clicks on Pay Now button$")
	public void user_clicks_on_Pay_Now_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.ClickOnPayNowButton();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	    
	}

	@Then("^User enters Password \"([^\"]*)\"$")
	public void user_enters_Password(String strPassword) throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.setPassword(strPassword);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}

	@Then("^User clicks on ok button$")
	public void user_clicks_on_ok_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.ClickOnOkButton();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		driver.quit();
	    
	}

	@Then("^I enter Card Number \"([^\"]*)\"$")
	public void i_enter_Card_Number(String strCardNumber) throws Throwable {
	    
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.setCardNumber(strCardNumber);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}

	@Then("^I enter invalid Expiry Date \"([^\"]*)\"$")
	public void i_enter_invalid_Expiry_Date(String strExpiryDate) throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.setExpiryDate(strExpiryDate);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	    
	}

	@Then("^I enter CVV Number \"([^\"]*)\"$")
	public void i_enter_CVV_Number(String strCVVNumber) throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.setCVVNumber(strCVVNumber);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	    
	}

	@Then("^I click on PayNow button$")
	public void i_click_on_PayNow_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.ClickOnPayNowButton();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}

	@Then("^I enter Password \"([^\"]*)\"$")
	public void i_enter_Password(String strPassword) throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.setPassword(strPassword);
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}

	@Then("^I click on okbutton$")
	public void i_click_on_okbutton() throws Throwable {
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP = new Successful_Payment(driver);
		SP.ClickOnOkButton();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		SP.ClickRetryButton();
		Thread.sleep(1000);
		driver.quit();
	}}


