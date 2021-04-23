Feature: AccederRegistroConCuentaDeCorreo


  Scenario: Access registration with email account
    Given Ramon is on the sign in page
    When he writes his mail "axstav19994@gmail.com"
    And he select the button to create an account
    Then he is on the registration page