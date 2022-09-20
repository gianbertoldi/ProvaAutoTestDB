package validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import framework.Report.Report;
import framework.Report.Screenshot;
import framework.browser.Waits;
import locale_PageObjects.Locale_UserListPage;

public class UserListValidation {

	private WebDriver driver;

	private Locale_UserListPage userListPage;

	private Waits wait;

	public UserListValidation(WebDriver driver) {

		this.driver = driver;
		userListPage = new Locale_UserListPage(driver);
		wait = new Waits(driver);

	}

	public void ValidationUserListMessage() {

		try {
			String label = userListPage.getUserListLabelText().getText();
			Assertions.assertEquals("Lista de Usuários!!", label);
			Report.log(Status.PASS, "Acessou a lista de usuários com sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

}
