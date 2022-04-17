@SetPass
Feature: Top Movie
  Scenario Outline: Open the application and make sure a list of movie tiles is displayed.
    Given User go to site "https://top-movies-qhyuvdwmzt.now.sh/"
    And user verifies all movie card is dsiplayed
    And user verify movie "The Shawshank Redemption" make sure the release date "1994-09-22" is correctly displayed.
    And user search for "Star Trek" and make sure that "Star Trek: First Contact" is displayed and "The Shawshank Redemption" is not displayed
    Then verifies that the movie name "<movieName>" Released on "<released>" popularity "<popularity>" vote average "<voteAverage>" and vote "<voteCount>"

    Examples: test data

      |movieName|released|popularity|voteAverage|voteCount|
      |Impossible Things|2021-06-17|63.055    |9.1        |204    |


