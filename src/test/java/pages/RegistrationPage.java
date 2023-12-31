package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.TableResultComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {


    CalendarComponent calendar = new CalendarComponent();
    TableResultComponent tableResultComponent = new TableResultComponent();
    SelenideElement
            titleLabel = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            userSubjectInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            userFileInput = $("#uploadPicture"),
            userCurrentAddress = $("#currentAddress"),
            userState = $("#state"),
            userCity = $("#city"),
            submitButton = $("#submit"),
            titleText = $("#example-modal-sizes-title-lg");


 // result = $(".modal-content");


    public RegistrationPage openPage(String value) {
        open(value);
        titleLabel.shouldHave(text("Student Registration Form"));
        return this;
    }

    public RegistrationPage removeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }


    public RegistrationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendar.setDate(day, month, year);

        return this;
    }


    public RegistrationPage setSubjects(String value) {
        userSubjectInput.setValue(value).pressEnter();

        return this;

    }

    public RegistrationPage setHobbies(String value) {
        hobbiesWrapper.$(byText(value)).click();

        return this;

    }

    public RegistrationPage setFile(String value) {
        userFileInput.uploadFromClasspath(value);

        return this;

    }

    public RegistrationPage setCurrentAddress(String value) {
        userCurrentAddress.setValue(value);

        return this;

    }

    public RegistrationPage setState(String value) {
        userState.click();
        userState.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value) {
        userCity.click();
        userCity.$(byText(value)).click();

        return this;

    }

    public RegistrationPage clickSubmit() {
        submitButton.click();
        return this;
    }

    public RegistrationPage titleText() {
        titleText.shouldHave(text("Thanks for submitting the form"));

        return this;
    }

    public RegistrationPage checkResult(String key, String value) {
        tableResultComponent.checkResult(key, value);

        return this;
    }


}
