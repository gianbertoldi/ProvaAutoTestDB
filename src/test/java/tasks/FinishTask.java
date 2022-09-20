package tasks;

import org.openqa.selenium.WebDriver;

import locale_PageObjects.Locale_ConfirmPage;
import locale_PageObjects.Locale_UserListPage;
import validations.FinishValidation;
import validations.UserListValidation;

public class FinishTask {

	private WebDriver driver;

	private Locale_ConfirmPage finishPage;

	private Locale_UserListPage userListPage;

	private FinishValidation finishValidation;

	private UserListValidation userListValidation;

	public FinishTask(WebDriver driver) {

		this.driver = driver;
		finishPage = new Locale_ConfirmPage(driver);
		userListPage = new Locale_UserListPage(driver);
		finishValidation = new FinishValidation(driver);
		userListValidation = new UserListValidation(driver);

	}

	public void finalizarCriacao() {

		finishValidation.ValidationUserCreated();
		finishPage.getBackButton().click();
		userListValidation.ValidationUserListMessage();

	}

	public void fecharListaUsuario() {

		userListValidation.ValidationUserListMessage();
		userListPage.getUserListBackButton().click();

	}

}
