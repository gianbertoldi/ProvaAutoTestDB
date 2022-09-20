package locale_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.browser.Waits;

public class Locale_InitialPage {

	public WebDriver driver;

	public Waits wait;

	public Locale_InitialPage(WebDriver driver) {

		this.driver = driver;
		wait = new Waits(driver);
	}

	public WebElement getAutomacaoWebTitle() {

		return wait.visibilityOfElement(By.id("index-banner"));

	}

	public WebElement getStartButton() {

		return driver.findElement(By.xpath(
				"//div[@id='index-banner']/div[@class='container']/div[@class='row center']/a[@class='btn waves-light orange']"));

	}

}
