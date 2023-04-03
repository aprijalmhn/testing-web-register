@Register
Feature: Register

  @Register01
  Scenario: Create account succesfully

    Given User go to web "https://stage.mobipaid.com/en/register"
    And Input first name "Aprijal"
    And Input last name "Muhaemin"
    And Input email "aprijalmhn@gmail.com"
    And Input password "Test12345678*"
    And Input company name "Tester"
    And Input no telepon "89637214361"
    And Select country
    And Click box accept service aggrement
    And Click button next step
    Then Should successfully createt account

  @Register02
  Scenario: Create account without input first name

    Given User go to web "https://stage.mobipaid.com/en/register"
    And Without input first name
    And Input last name "Muhaemin"
    And Input email "aprijalmhn@gmail.com"
    And Input password "Test12345678*"
    And Input company name "Tester"
    And Input no telepon "89637214361"
    And Select country
    And Click box accept service aggrement
    And Click button next step
    Then Should successfully createt account

  @Register03
  Scenario: Create account without input last name

    Given User go to web "https://stage.mobipaid.com/en/register"
    And Input first name "Aprijal"
    And Without input last name
    And Input email "aprijalmhn@gmail.com"
    And Input password "Test12345678*"
    And Input company name "Tester"
    And Input no telepon "89637214361"
    And Select country
    And Click box accept service aggrement
    And Click button next step
    Then Should successfully createt account

  @Register04
  Scenario: Create account without input password

    Given User go to web "https://stage.mobipaid.com/en/register"
    And Input first name "Aprijal"
    And Input last name "Muhaemin"
    And Input email "aprijalmhn@gmail.com"
    And Without input password
    And Input company name "Tester"
    And Input no telepon "89637214361"
    And Select country
    And Click box accept service aggrement
    And Click button next step
    Then Should successfully createt account

  @Register05
  Scenario: Create account without input company name

    Given User go to web "https://stage.mobipaid.com/en/register"
    And Input first name "Aprijal"
    And Input last name "Muhaemin"
    And Input email "aprijalmhn@gmail.com"
    And Input password "Test12345678*"
    And Without input company name
    And Input no telepon "89637214361"
    And Select country
    And Click box accept service aggrement
    And Click button next step
    Then Should successfully createt account
