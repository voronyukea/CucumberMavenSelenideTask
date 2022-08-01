Feature: Auth, enter to users menu, check sort
  Scenario: Enter to login page, enter to User menu, check sort
    Then Input Login
    Then Input Password
    Then Click "Sign in" button
    Then Content with "Casino" label
    Then Open menu "Users"
    Then Open submenu "Players"
    Then Сheck table availability
    Then Сreating preconditions for sorting a column "Username"
    Then Save userdata before sorting
    Then Apple first sort on a column "Username"
    Then Check userdata after first sorting
    Then Apple second sort on a column "Username"
    Then Check userdata after second sorting
