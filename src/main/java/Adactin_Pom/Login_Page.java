package Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement pwd;
	
	public Login_Page(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	@FindBy(id="login")
	private WebElement login_btn;
}
