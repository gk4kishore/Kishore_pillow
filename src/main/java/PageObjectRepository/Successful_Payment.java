package PageObjectRepository;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Successful_Payment {

	WebDriver driver;

	public Successful_Payment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn buy']")
	private WebElement BuyButton;

	public void ClickOnBuyButton() {
		try {
			BuyButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	@FindBy(xpath = "//a[@href='#/']")
	private WebElement RetryButton;

	public void ClickOnRetryButton() {
		try {
				RetryButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void ClickRetryButton() throws InterruptedException {
			List<WebElement> listFrames = driver.findElements(By.tagName("a"));
			for (int i = 0; i < listFrames.size(); i++) {
				Thread.sleep(4000);
                driver.switchTo().frame(i);
                Thread.sleep(4000);
                RetryButton.click();
                Thread.sleep(4000);
                break;
			}
	}
	
	
	public void TransactionfailedTextDisplay(String option) {
		try {
			List<WebElement> listFrames = driver.findElements(By.xpath("//*[@id='application']/div[3]/div/div/div/div/div/div[1]/span"));
			for (int i = 0; i < listFrames.size(); i++) {
				listFrames.get(i).getText();
				if(listFrames.get(i).getText().contains(option))
				{
					System.out.println("Matches");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	By TransactionfailedTextOne=By.xpath("//*[@id='application']/div[3]/div/div/div/div/div/div[1]/span");
	 public String getisTransactionfailedDisplay(){

         return    driver.findElement(TransactionfailedTextOne).getText();

        }
	 
	public void isTransactionfailedDisplay(){
		String getheadertext=driver.findElement(TransactionfailedTextOne).getText();
		Assert.assertEquals("Transaction failed", getheadertext);
	}
	
	
	
	
	
	
	@FindBy(xpath = "//span[contains(.,'Transaction failed')]")
	private WebElement TransactionfailedText;
	
	public void getTransactionfailedText() {
		try {
			TransactionfailedText.getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@FindBy(xpath = "//div[@id='payment-list']/div/a[@href='#/credit-card']")
	private WebElement TapingCardButton;
	
	

	public void ClickOnTapingCardButton() {
		try {
			TapingCardButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void TapCardButton(String option) {
		try {
			List<WebElement> listFrames = driver.findElements(By.tagName("a"));
			for (int i = 0; i < listFrames.size(); i++) {
				listFrames.get(i).getText();
				if(listFrames.get(i).getText().contains(option))
				{
					System.out.println("Option Matches");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	By CreditCardButton = By.xpath("//div[@id='payment-list']/div/a[@href='#/credit-card']");

	public WebElement getCreditDebitCardButton() {
		return driver.findElement(CreditCardButton);
	}

	@FindBy(xpath = "//div[@class='cart-checkout']")
	private WebElement CartCheckoutButton;

	public void ClickOnCartCheckoutButton() {
		try {
			CartCheckoutButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@FindBy(xpath = "//div[@class='app-container']/div/a[@class='button-main-content']")
	private WebElement ContinueButton;

	public void ClickOnContinueButton() {
		try {
			List<WebElement> listFrames = driver.findElements(By.tagName("iframe"));
			for (int i = 0; i < listFrames.size(); i++) {
				driver.switchTo().frame(i);
				ContinueButton.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@FindBy(xpath = "//input[@name='cardnumber']")
	private WebElement CardNumber;

	public void setCardNumber(String strCardNumber) {
		try {
			CardNumber.sendKeys(strCardNumber);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new AssertionError("CardNumber not entered", e);
		}
	}

	@FindBy(xpath = "//input[@placeholder='MM / YY']")
	private WebElement ExpiryDate;

	public void setExpiryDate(String strExpiryDate) {
		try {
			ExpiryDate.sendKeys(strExpiryDate);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new AssertionError("Password not entered", e);
		}
	}

	@FindBy(xpath = "//div[@class='card-container']/div[@class='input-group col-xs-7 error']")
	private WebElement ExpiryDateValidation;

	public void setExpiryDateValidation() {
		try {

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new AssertionError("Password not entered", e);
		}
	}

	@FindBy(xpath = "//input[@placeholder='123']")
	private WebElement CVVNumber;

	public void setCVVNumber(String strCVVNumber) {
		try {
			CVVNumber.sendKeys(strCVVNumber);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new AssertionError("Password not entered", e);
		}
	}

	@FindBy(xpath = "//input[@name='PaRes']")
	private WebElement Password;

	public void setPassword(String strPassword) {
		try {
			List<WebElement> listFrames = driver.findElements(By.tagName("iframe"));
			for (int i = 0; i < listFrames.size(); i++) {
				driver.switchTo().frame(i);
				Password.sendKeys(strPassword);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new AssertionError("Password not entered", e);
		}
	}

	@FindBy(xpath = "//div/button[@name='ok']")
	private WebElement OkButton;

	public void ClickOnOkButton() {
		try {
			OkButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@FindBy(xpath = "//a[@class='button-main-content']")
	private WebElement PayNowButton;

	public void ClickOnPayNowButton() {
		try {
			PayNowButton.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
