package stepdefinitions.US_04;

public class US04_TC02_API_StepDefs {
    /*
        Given
            https://managementonschools.com/app/dean/save
        When
            Admin send a POST request to the URL
        Then
            HTTP Status Code should be 200
        And
            Response content type is “application/json”
        And
            Response body should be like:
                {
                    "id": 1350,
                    "username": "ahmadjan",
                    "ssn": "872-43-2021",
                    "name": "Ahmad",
                    "surname": "Jan",
                    "birthDay": "2004-12-12",
                    "birthPlace": "Kabul",
                    "phoneNumber": "877-354-9873",
                    "gender": "MALE"
                }

        And
            Admin should be able to delete the guest user
        And
            Validate if the guest user is deleted

    */
}
