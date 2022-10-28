@stories
Feature: register new user in utest page
  as user of utest page
  as user need register
  so that to see the products
  @CaseOne
  Scenario Outline: register successful in the aplication

    Given the user in the aplication https://www.utest.com/
    When the user register in aplication
      | firstName   | lastName   | emailAdress   | month   | day   | year   | city   | state   | postalCode   | country   | computer   | version   | languaje   | mobileDevice   | model   | opertaingSystem   | password   |
      | <firstName> | <lastName> | <emailAdress> | <month> | <day> | <year> | <city> | <state> | <postalCode> | <country> | <computer> | <version> | <languaje> | <mobileDevice> | <model> | <opertaingSystem> | <password> |
    Then the user should see message
      | strConfirmWelcome   |
      | <strConfirmWelcome> |

    Examples:
      | firstName | lastName  | emailAdress               | month    | day | year | city     | state     | postalCode | country  | computer | version | languaje | mobileDevice | model   | opertaingSystem | password         | strConfirmWelcome                                                       |
      | Jhonatan  | Paternina | jpaterninarojas231312231@gmail.com | December | 2   | 1993 | Montería | Antioquia | 230001     | Colombia | Linux    | Ubuntu  | English  | Motorola     | Edge 30 | Android 12      | 123456Qwerty@.#- | Welcome to the world's largest community of freelance software testers! |