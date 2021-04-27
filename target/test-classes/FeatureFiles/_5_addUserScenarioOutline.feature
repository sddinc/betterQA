Feature:TC05_add user to register form

  Scenario Outline:Login
    Given navigate to sdinc
    Given enter username as "volkan"
    Given enter password as "123456"
    Given click to authentifica

    When click to message box and trimite
    When select  "<Destination>"
    When enter title "<Title>"
    When enter text message "<Text_message>"
    When click to trimite button


    Examples:
      | Destination | Title | Text_message |
      |volkan|Homework week 2|type code with cpp, sum of the two numbers|
      |Popescu|Homework week 2|type code with cpp, sum of the two numbers|

