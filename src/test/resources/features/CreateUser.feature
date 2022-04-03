Feature: Create User In Utest
  Create a user on the test page.

  @scenario1
  Scenario: Successful user registration
    Given that Juan wants to register on the Utest page, he enters
    When el Enter all the information they ask me in the form
      | firstName | lastName | email              | city    | postalCode |srcPais| password    | confPassword |
      | Juan      | Pepe     | Juan2021@gamil.com | Cali Valle del Cauca|    050002 | Colombia  |TtaRys712/0 | TtaRys712/0  |
    Then validate that the message appears
      | strTitle                                                                |
      | Welcome to the world's largest community of freelance software testers! |
