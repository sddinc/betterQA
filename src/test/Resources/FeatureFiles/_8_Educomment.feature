@SetPass
Feature: Set password for student
  Scenario: Go to login educare
    Given user go to login "https://lumina.myeducare.ro/login.php"
    And user enter username as  "Sedat Dinc"
    And user enter password as "Iasi.2020!"
    And user click to sign in button

    And user click to image account to switch teacher
    And user click to link recordbook
    And user click to termcomment
    And user select to dropdown
    And user enter comment excel table


#    And user enter to commentBox
#    And user clcik to sevaComment

