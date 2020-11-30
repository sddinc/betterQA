Feature:TC04_add user data with Scenario

  Background:
    Given navigate to koala
    Given click login link
    Given type a valid username
    Given click on login button

  Scenario:Add user
    Given click to  add user button
    When create username to register form
    When create password to register form
    When crete email to regfister form
    When create fullname to register form
    When crete Phone No to regfister form
    When create Social Security Number to register form
    When create Driving License to register from
    When select country on register form
    When create State to register form
    When create Address to register from
    When select Date of Birth on register from
    When create WorkingSector on register from
    When select Role on register from
    When select Approved on register from
    When click on save button