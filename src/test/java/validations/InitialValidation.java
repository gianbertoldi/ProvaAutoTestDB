package validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.Report.Report;
import framework.Report.Screenshot;
import framework.browser.Waits;
import locale_PageObjects.Locale_InitialPage;

public class InitialValidation {

	private WebDriver driver;

	private Locale_InitialPage initialPage;

	private Waits wait;

	public InitialValidation(WebDriver driver) {

		this.driver = driver;
		initialPage = new Locale_InitialPage(driver);
		wait = new Waits(driver);

	}

	public void ValidationFirstPage() {

		try {

			wait.loadElement(initialPage.getAutomacaoWebTitle());
			Assertions.assertTrue(initialPage.getAutomacaoWebTitle().isDisplayed());
			Report.log(Status.PASS, "Página Inicial Acessada com Sucesso", Screenshot.capture(driver));
		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}

}
