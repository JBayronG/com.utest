Feature: Create User In Utest
  Create a user on the test page.

  @scenario1
  Scenario: Successful user registration
    Given that Juan wants to register on the Utest page, he enters
    When el Enter all the information they ask me in the form
      | firstName | lastName | email              |strMonth |strDay|strYear|city  | postalCode |srcPais    |strComputer|strVersion|strLanguage|strMobileDevice|strModel|strOP| password    |
      | Juan      | Pepe     | Juan2051@gamil.com | June    | 2    | 2000  |Dabeiba |  02345     | Colombia  | Windows   | 10       |   Spanish |Linux       |A30     |Android 6.0| TtaRys712/0 |
    Then validate that the message appears
    |strButton_Final|strTitle                                                                |
    |Complete Setup |Welcome to the world's largest community of freelance software testers! |