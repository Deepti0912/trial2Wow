Feature: Login to Dropbox site

  Scenario: Validate user with valid login details can successfully login to DropBox site

    Given User enters username "testing123syd@gmail.com" and password "testing123@" on DropBox site
    Then  User is able to successfully login

