package tasks;

import org.openqa.selenium.WebDriver;

import framework.Utils.FakersGeneration;
import locale_PageObjects.Locale_NewUser;
import validations.CreateUserValidation;
import validations.FinishValidation;

public class CreateUserTask {

	private WebDriver driver;

	private Locale_NewUser createUserPage;

	private CreateUserValidation createUserValidation;

	private FakersGeneration fakers;

	private FinishValidation finishValidation;

	public CreateUserTask(WebDriver driver) {

		this.driver = driver;
		createUserPage = new Locale_NewUser(driver);
		createUserValidation = new CreateUserValidation(driver);
		fakers = new FakersGeneration(driver);
		finishValidation = new FinishValidation(driver);

	}

	public void preencherForm() {
		createUserValidation.ValidationCreateUserMessage();
		createUserPage.getFirstNameTextField().sendKeys(fakers.getFirstName());
		createUserPage.getLastNameTextField().sendKeys(fakers.getLastName());
		createUserPage.getEmailTextField().sendKeys(fakers.getEmail());
		createUserPage.getAddressTextField().sendKeys(fakers.getAddress());
		createUserPage.getUniversityTextField().sendKeys(fakers.getUniversity());
		createUserPage.getProfessionTextField().sendKeys(fakers.getProfession());
		createUserPage.getGenderTextField().sendKeys("unknown");
		createUserPage.getAgeTextField().sendKeys("20");
		createUserPage.getSubmitButton().click();
		finishValidation.ValidationUserCreated();

	}

}