@SetPass
Feature: Set password for student
  Scenario: Go to login educare
    Given user go to login "https://lumina.myeducare.ro/login.php"
    And user enter username as  "Sedat Dinc"
    And user enter password as "Iasi.2020!"
    And user click to sign in button
    And user click to image account to switch secretay
    And user click to secretay link
    And user click to students link
    And user click to students list link
    And user enter student name and surname from excel table
