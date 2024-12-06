Feature: Searching for Bengaluru

  @SmokeTest
  Scenario: Able to see Bengaluru images
    Given launch Chrome browser and land on Google.com website
    When Click on Images link
    Then Search for Bengaluru images and hit Enter button
    Then Close the browser

    @HimaTest
    Scenario: Able to see Punganur images
      Given launching Chrome browser and land on Google.com website
      When Click on the Images link
      Then Searching for Punganur images and hit Enter button
      Then Closeing the browser

    @logTest
    Scenario: Searching the roman reings photos
      Given launch Chrome browser and land on www.google.com website
      When hit on the images link
      Then searching the Roman regins photos and hit the enter button
      Then close the chrome browser