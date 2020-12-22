Feature: feature to test https://www.epam.com

Background:
        Given EPAM website "https://www.epam.com"


  Scenario: Reading job offer
    When I click1 on "Careers"
    And I click2 on "Get Started Now"
    Then I go0 to the page with job offers

  Scenario: Searching
    When I click3 on Search button
    And I search1 for "Contact"
    Then I see0 list of aricles that have word "contact"
    
  Scenario: Searching on other languages
    When I click4 on Search button
    And I search2 for "Контакт"
    Then I see1 list of aricles that have word "Контакт"

  Scenario: Going home
    Given I am on page1 "Services"
    When I click on5 "<epam>"
    Then I go1 to the main page

  Scenario: Following a link
    When I click6 "About"
    And I scroll down
    And I click7 "FOLLOW. Instagram"
    Then I go2 to the  instagram page

  Scenario: Route to SolutionHub
    Given I am on the page1 "How we do it"
    When I click8 on words "our own IP"
    Then I go3 to the page SolutionHub

  Scenario: Customer solution article
    Given I am on the page "Our work"
    When I click on "Healthcare"
    And I click9 on "Learn more"
    Then I am on page more

  Scenario: Contact us
    When I click11 on "Contact us"
    And I  fill out an application
    And i click0 "submit"
    Then I see2 a notification about successful submission
