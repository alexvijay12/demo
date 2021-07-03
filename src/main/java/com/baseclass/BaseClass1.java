package com.baseclass;

import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BaseClass1 {
	
	public static WebDriver driver;

	//click
	public static void clickOnElement(WebElement Element) {
		
		try {
			Element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//sendkey
	public static void Inputvalue(WebElement Element, String value) {
		
		try {
			Element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

			public static WebDriver getDriver(String browsername) throws Exception {
					if (browsername == "chrome") {
						System.setProperty("webdriver.chrome.driver", "C:\\Java_Alex\\adactin_Proj\\Driver1\\chromedriver.exe");
						driver = new ChromeDriver();
					}
				
				driver.manage().window().maximize();

				return driver;
			}

			// get URL

			public static void getUrl(String url) throws Exception {
				try {
					driver.get(url);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new Exception("url is not present");
				}
			}


			public static void navigateto(String url) {
				try {
					driver.navigate().to(url);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// navigate back

			public static void navigateback() {
				try {
					driver.navigate().back();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// navigate forward

			public static void navigateforward() {
				try {
					driver.navigate().forward();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			

			// navigate refresh

			public static void refresh() {
				try {
					driver.navigate().refresh();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// get Text

			public static void getText(WebElement element) {
				try {
					System.out.println(element.getText());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			// get Attribute

			public static void getAttribute(WebElement element) {
				try {
					String attribute = element.getAttribute("Value");
					System.out.println(attribute);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// radio button

			public static void radiobutton(WebElement element) {
				try {
					element.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}



			// first selected option

			public static void firstSelectedOp(WebElement element) {
				Select y = new Select(element);
				WebElement firstSelectedOption = y.getFirstSelectedOption();
				System.out.println(firstSelectedOption.getText());
			}

			
			// screen shot

			public static void screenshot() throws Exception {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
				File saveFile = new File("D:\\eclipse workspace\\Selenium_Day1\\filescreenshot\\suji.png");
				Files.copy(screenshotAs, saveFile);

			}

			// window handles

			public static void Windowhandles(WebElement element) {
				String childid = driver.getWindowHandle();
				element.click();
				Set<String> parentid = driver.getWindowHandles();
				String y = null;
				for (String d : parentid) {
					if (!d.equals(childid)) {
						y = d;
					}
				}
				driver.switchTo().window(y);

			}

			// Alerts

			public static void Alertsss(WebElement element, String var) {
				element.click();
				Alert alert = driver.switchTo().alert();
				if (var == "accept") {
					alert.accept();
					driver.switchTo().defaultContent();
				} else {
					alert.dismiss();
					driver.switchTo().defaultContent();

				}

			}

			public static void Alerts1(WebElement element, String r, String value) {
				element.click();
				Alert alert = driver.switchTo().alert();
				alert.sendKeys(value);

			}

			// close
			public static void closee() {
				driver.close();
			}

			// quit
			public static void quitt() {
				driver.quit();
			}

			// double click
			public static void Doubleclickkk(WebElement element) {
				Actions ac1 = new Actions(driver);
				ac1.doubleClick(element).build().perform();
			}

			// click
			public static void clickkk(WebElement element) {
				Actions ac2 = new Actions(driver);
				ac2.click(element).build().perform();
			}

			// right click

			public static void rightclick(WebElement element) {
				Actions ac3 = new Actions(driver);
				ac3.contextClick(element).build().perform();

			}

			// send keys using actions
			public static void sendkeysActions(WebElement element, String value) {
				Actions ac4 = new Actions(driver);
				ac4.sendKeys(element, value).build().perform();
			}

			// robot

			public static void robotttt(WebElement element, String value) throws Exception {
				Actions ac = new Actions(driver);
				ac.contextClick(element).build().perform();
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);

			}

			// drag and drop
			public void dragdrop(WebElement element1, WebElement element2) {

				Actions ac = new Actions(driver);
				ac.dragAndDrop(element1, element2).build().perform();

			}

			// i-Frames

			public void iframes(WebElement elements) {
				driver.switchTo().frame(elements);

			}

			// explicit wait

			public static void waitforvisibilityofelment(WebElement element) {

				try {
					WebDriverWait wb = new WebDriverWait(driver, 30);
					wb.until(ExpectedConditions.visibilityOf(element));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			// is displayed

			public static boolean elementisDisplayed(WebElement element) {
				boolean displayed = false;

				try {
					displayed = element.isDisplayed();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return displayed;

			}

			// is enabled

			public static boolean elementisenabled(WebElement element) {
				boolean enabled = false;

				try {
					enabled = element.isEnabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return enabled;

			}

			// is selected

			public boolean elementisselected(WebElement element) {

				boolean selected = false;
				try {
					selected = element.isSelected();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return selected;
			}

		}




		
		
	
	
	
	
	
	
	
	
	
	