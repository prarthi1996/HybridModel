Feature: ReferAProductToFriend

  As a user, I want to refer a product to friend

  @test3
  Scenario: User should be able to register successfully
    Given user is a registered user
    When user is on home page
    And  user clicks on computer category
    And user click on add to cart button
    And click on email a friend button
    Then registered user should be able to refer a product via email
