package tests;

import org.junit.jupiter.api.Test;
import utils.utils.Utils;

public class RegistrationTestsWithFakerTests extends TestBase
{
    Utils utils = new Utils();
    @Test
    void succesfulRegistrationTest() {


        registrationPage.openPage("/automation-practice-form")
                .removeBanners()
                .setFirstName(utils.firstName)
                .setLastName(utils.lastName)
                .setUserEmail(utils.userEmail)
                .setGender(utils.userGender)
                .setUserNumber(utils.userNumber)
                .setDateOfBirth(utils.day, utils.month, utils.year)
                .setSubjects(utils.subject)
                .setHobbies(utils.hobbies)
                .setFile(utils.file)
                .setCurrentAddress(utils.currentAddress)
                .setState(utils.state)
                .setCity(utils.city)
                .clickSubmit()

                .titleText()
                .checkResult("Student Name", utils.firstName + " " + utils.lastName)
                .checkResult("Student Email", utils.userEmail)
                .checkResult("Gender", utils.userGender)
                .checkResult("Mobile", utils.userNumber)
                .checkResult("Date of Birth", utils.day + " " + utils.month + "," + utils.year)
                .checkResult("Subjects", utils.subject)
                .checkResult("Hobbies", utils.hobbies)
                .checkResult("Picture", utils.file.replaceAll("img/", ""))
                .checkResult("Address", utils.currentAddress)
                .checkResult("State and City", utils.state + " " + utils.city);


    }
}
