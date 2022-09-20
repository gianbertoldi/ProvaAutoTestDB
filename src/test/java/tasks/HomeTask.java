package tasks;

import org.openqa.selenium.WebDriver;

import locale_PageObjects.Locale_HomePage;
import validations.GenericValidation;

public class HomeTask {

	private WebDriver driver;

	private Locale_HomePage homePage;

	private GenericValidation genericValidation;

	public HomeTask(WebDriver driver) {

		this.driver = driver;
		genericValidation = new GenericValidation(driver);
		homePage = new Locale_HomePage(driver);

	}

	public void clicarBotaoFormulario() {
		genericValidation.ValidationFunctionList();
		homePage.getFormularioButton().click();
		homePage.getCriarFormularioButton().click();

	}

}
