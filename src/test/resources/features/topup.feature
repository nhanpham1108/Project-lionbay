Feature: topup

  Scenario Outline: Đăng nhập đúng tài khoản KH
    Given Go to page <link>
    When Set username = <username>
    And Set password = <password>
    And Click button login
    Then Redirect to <link1>
    @dev
    Examples:
      |                          link   |              username |    password |                       link1|
      | https://ship.lionnix.net/sign-in|      demoa100@yopmail.com |      123455 |   https://ship.lionnix.net/|


    @prod
    Examples:
      |                                 link |                username |  password |                         link1|
      | https://ship.lionbay.express/sign-in |  laclac110897@gmail.com |    123455 | https://ship.lionbay.express/|


  Scenario Outline: Chuyển khoản thành công
    Given Go to page <link>
    When Recharge tab
    And Check wallet
    And Click transfer
    And Enter money = 1000
    And Confirm transfer
    And And go to page <link1>
    And Set username admin = <username>
    And Set password admin = <password>
    And Login admin
    And And go to page <link2>
    And Search for emails on topup = <email>
    And Admin confirms topup
    And And go to page <link>
    Then vi
    @dev
    Examples:
      |                                       link   |                                 link1 |            username |      password |  link2 |                                                                                            email |
      | https://ship.lionnix.net/bill?limit=25&page=1| https://ship-admin.lionnix.net/sign-in|   admin@yopmail.com |        123455 |  https://ship-admin.lionnix.net/transactions?limit=30&search_by=account&type=1&page=1  | demoa100@yopmail.com |


    @prod
    Examples:
      |                                              link |                                  link1 |         username   |         password | link2  |                                                                                                       email |
      | https://ship.lionbay.express/bill?limit=25&page=1 |  https://admin.lionbay.express/sign-in |   admin@lionnix.vn |    LionNB@y#2021 | https://admin.lionbay.express/transactions?limit=30&search_by=account&type=1&page=1&tester=1 |laclac110897@gmail.com |


  Scenario Outline: payoner thành công
    Given Go to page <link>
    When Recharge tab
    And Check wallet
    And Click payoner
    And Transation = xxx
    And Enter money = 1000
    And Confirm transfer
#  And Go to page1 <link1>
#  And Nhap username admin = <username>
#  And Set password admin = <password>
#  And login admin
    And And go to page <link2>
    And Search for emails on topup = <email>
    And Admin confirms topup
    And And go to page <link>
    Then vi
    @dev
    Examples:
      |                                       link   |                                 link1 |            username |      password |  link2 |                                                                                            email |
      | https://ship.lionnix.net/bill?limit=25&page=1| https://ship-admin.lionnix.net/sign-in|   admin@yopmail.com |        123455 |  https://ship-admin.lionnix.net/transactions?limit=30&search_by=account&type=1&page=1  | demoa100@yopmail.com |


    @prod
    Examples:
      |                                              link |                                  link1 |         username   |         password | link2  |                                                                                                       email |
      | https://ship.lionbay.express/bill?limit=25&page=1 |  https://admin.lionbay.express/sign-in |   admin@lionnix.vn |    LionNB@y#2021 | https://admin.lionbay.express/transactions?limit=30&search_by=account&type=1&page=1&tester=1 |laclac110897@gmail.com |


  Scenario Outline: pingpong thành công
    Given Go to page <link>
    When Recharge tab
    And Check wallet
    And Click pingpong
    And Transation = xxx
    And Enter money = 1000
    And Confirm transfer
#  And Go to page1 <link1>
#  And Nhap username admin = <username>
#  And Set password admin = <password>
#  And login admin
    And And go to page <link2>
    And Search for emails on topup = <email>
    And Admin confirms topup
    And And go to page <link>
#  Then kq topup = Thành công
    Then vi
    @dev
    Examples:
      |                                       link   |                                 link1 |            username |      password |  link2 |                                                                                             email |
      | https://ship.lionnix.net/bill?limit=25&page=1| https://ship-admin.lionnix.net/sign-in|   admin@yopmail.com |        123455 |  https://ship-admin.lionnix.net/transactions?limit=30&search_by=account&type=1&page=1  |  demoa100@yopmail.com |


    @prod
    Examples:
      |                                              link |                                  link1 |         username   |         password | link2  |                                                                                                        email |
      | https://ship.lionbay.express/bill?limit=25&page=1 |  https://admin.lionbay.express/sign-in |   admin@lionnix.vn |    LionNB@y#2021 | https://admin.lionbay.express/transactions?limit=30&search_by=account&type=1&page=1&tester=1 | laclac110897@gmail.com |
