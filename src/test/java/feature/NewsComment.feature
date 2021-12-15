Feature: AddNewsComment

  As a user, I should be able to add comment in News Section

  @test2
  Scenario: User should be able to successfully add comments in news section
    Given user click on newsButton on homepage
    When user clicks on detailsButton on News page
    And user enter the comment in the commentSection
    Then user should be able to add a comment