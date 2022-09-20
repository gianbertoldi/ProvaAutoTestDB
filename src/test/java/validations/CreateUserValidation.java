package validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.Report.Report;
import framework.Report.Screenshot;
import framework.browser.Waits;
import locale_PageObjects.Locale_NewUser;

public class CreateUserValidation {

	private WebDriver driver;

	private Locale_NewUser createUserPage;

	private Waits wait;

	public CreateUserValidation(WebDriver driver) {

		this.driver = driver;
		createUserPage = new Locale_NewUser(driver);
		wait = new Waits(driver);
	}

	public void ValidationCreateUserMessage() {

		try {
			wait.loadElement(createUserPage.getNewUserTextLabel());
			Assertions.assertTrue(createUserPage.getNewUserTextLabel().isDisplayed());
			Report.log(Status.PASS, "Acessou a página de criação de usuário com sucesso",
					Screenshot.captureBase64(driver));
		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}
}
