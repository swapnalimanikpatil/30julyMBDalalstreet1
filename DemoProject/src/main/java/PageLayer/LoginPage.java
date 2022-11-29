package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//===============object repo================
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txt;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txt;
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	//=================Action methods=====================
	public void enterEmailId(String email)
	{
		email_txt.sendKeys( email);
	}
	public void enterPassword(String password)
	{
		password_txt.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
	public String getCURL()
	{
		String url = driver.getCurrentUrl();
		return url;

		}
}
