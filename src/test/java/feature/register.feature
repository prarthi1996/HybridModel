Feature: Registration

  As a user, I want to register on DemoNopeCommerce website
  So that, I can use all user feature

  @test4
  Scenario: User should be able to register successfully
    Given user is on registration page
    When user enters required registration details
    And click on register submit button
    Then user should able to register successfully

