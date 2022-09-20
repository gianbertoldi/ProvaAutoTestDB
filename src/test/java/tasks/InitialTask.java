package tasks;

import org.openqa.selenium.WebDriver;

import locale_PageObjects.Locale_InitialPage;
import validations.InitialValidation;

public class InitialTask {

	private WebDriver driver;

	private Locale_InitialPage initialPage;

	private InitialValidation initialValidation;

	public InitialTask(WebDriver driver) {

		this.driver = driver;
		initialPage = new Locale_InitialPage(driver);
		initialValidation = new InitialValidation(driver);

	}

	public void clicarBotaoAutomacaoWeb() {

		initialValidation.ValidationFirstPage();
		initialPage.getStartButton().click();

	}
}
