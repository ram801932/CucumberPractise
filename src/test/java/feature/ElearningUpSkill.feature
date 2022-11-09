Feature: To test elearning upskill application

  @Regression
  Scenario Outline: Register in Upskill & compose an email
    Given Open "http://elearningm1.upskills.in/"
    When Click on Sign up
    And fill up fields "<firstname>","<lastname>","<username>","<email>","<password>"
    Then verify that the next button is visible on successfull registration
    When Click on Next
    And Click on name dropdwon present at top right
    And Click on Profile
    And Click on messages
    And Click on Compose message
    And Fill up the fields to Send
    Then Click on send message

    Examples: 
      | firstname | lastname | username    | email          | password |
      | Ram       | Gujjaru  | RamGujjaru8 | Ram8@gmail.com | Password |



  @Regression
  Scenario Outline: Register in Upskill & update profile
    Given Open "http://elearningm1.upskills.in/"
    When Click on Sign up
    And fill up fields "<firstname>","<lastname>","<username>","<email>","<password>"
    Then verify that the next button is visible on successfull registration
    When Click on Next
    And Click on name dropdwon present at top right
    And Click on Profile
    And Click on Edit Profile
    And fill up edit profile fields "<firstname1>","<lastname1>","<phone>"
    Then Click on Save settings
    And Print success message

    Examples: 
      | firstname | lastname | username    | email          | password | firstname1 | lastname1 | phone      |
      | Ram       | Gujjaru  | RamGujjaru9 | Ram9@gmail.com | Password | RG         | Dhanush   | 9123456789 |
