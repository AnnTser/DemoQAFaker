package utils.utils;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;

public class Utils {

    public Faker faker = new Faker(new Locale("en"));

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userGender = setRandomGender(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            day = String.format("%02d", faker.number().numberBetween(1, 28)),
            month = setMonth(),
            year = String.valueOf(faker.number().numberBetween(1930, 2020)),
            subject = setSubjects(),
            hobbies = setHobby(),
            file = setFile(),
            currentAddress = faker.address().streetAddress(),
            city = setCityRandom(),
            state = setStateAndCity(city);

    public String setRandomGender() {
        String[] arrayGenders = {"Male", "Female", "Other"};

        return faker.options().option(arrayGenders);
    }

    public String setHobby() {
        String[] arrayHobby = {"Sports", "Reading", "Music"};

        return faker.options().option(arrayHobby);
    }
    public String setFile() {
        String [] arrayPictures = {"1.png","2.jpg","3.jpg"};
        return faker.options().option(arrayPictures);

    }
    public String setSubjects() {
        String[] arraySubjects = {"Math", "Physics", "Arts"};

        return faker.options().option(arraySubjects);
    }

    public String setCityRandom() {
        String[] arrayState = {"Delhi", "Agra", "Karnal", "Noida",
                "Lucknow", "Panipat", "Jaipur", "Jaiselmer"};

        return faker.options().option(arrayState);
    }

    public String setStateAndCity(String value) {
        HashMap<String, String> cityAndState = new HashMap<>();
        cityAndState.put("Delhi", "NCR");
        cityAndState.put("Noida", "NCR");
        cityAndState.put("Agra", "Uttar Pradesh");
        cityAndState.put("Lucknow", "Uttar Pradesh");
        cityAndState.put("Karnal", "Haryana");
        cityAndState.put("Panipat", "Haryana");
        cityAndState.put("Jaipur", "Rajasthan");
        cityAndState.put("Jaiselmer", "Rajasthan");

        return cityAndState.get(value);
    }


    public String setMonth() {
        String[] arrayMonth = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October", "November", "December"};

        return faker.options().option(arrayMonth);
    }


}
