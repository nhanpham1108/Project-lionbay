Feature: order

  Scenario Outline: Đăng nhập đúng tài khoản KH
    Given Go to page <link>
    When Set username = <username>
    And Set password = <password>
    And Click button login
    Then Redirect to <link1>
    @dev
    Examples:
      |                          link   |              username |    password |                       link1|
      | https://ship.lionnix.net/sign-in|      demob100@yopmail.com |      123455 |   https://ship.lionnix.net/|


    @prod
    Examples:
      |                                 link |                username |  password |                         link1|
      | https://ship.lionbay.express/sign-in |  laclac110897@gmail.com |    123455 | https://ship.lionbay.express/|


#  Scenario Outline: tạo đơn US thành công
#    Given Go to page <link>
#    When Single created button = "Tạo đơn"
#    And Fullname = "KH ABC"
#    And Phone = 0961035433
#    And City = Tecumseh
#    And Address1 = "514 N Broadway"
#    And Address2 = "514 N Broadway"
#    And State = OK
#    And Zipcode = 74873
#    And Countrycode = US
#    And Ordernumber = ordernumber1
#    And Detail = "Clothes1,2 Cosmetics"
#    And Weight = 2000
#    And Length = 20
#    And Width = 20
#    And Height = 20
#    And Pin
#    And Service = "Express"
#    And New create button
#    Then Order details screen = "Chi tiết đơn hàng"
##    And Delivery charges
#    @dev
#    Examples:
#      |                                             link |         username  |          password  |
#      | https://ship.lionnix.net/packages?limit=25&page=1|  demoa100@yopmail.com |            123455  |
#
#
#    @prod
#    Examples:
#      |                                                 link   |                username  |            password|
#      | https://ship.lionbay.express/packages?limit=25&page=1  |  laclac110897@gmail.com  |      LionNB@y#2021 |

  Scenario Outline: import đơn thành công
    Given Go to page <link>
    When Import excel = "Nhập Excel"
    And Upload file US
    Then Text successfully
  @dev
    Examples:
      |                                           link   |
      | https://ship.lionnix.net/packages?limit=25&page=1|


  @prod
    Examples:
      |                                 link |
      | https://ship.lionbay.express/packages?limit=25&page=1 |


  Scenario Outline: Vận nhiều đơn US hợp lệ, đúng địa chỉ
    Given Go to page <link>
    And And go to page <link1>
    And Check wallet
    And And go to page <link>
    And Select multiple orders
    And Gia tri van list
    And Nhan tao tracking list
    And Go to page2 <link1>
    And kiemtra transaction
    Then kq van
    @dev
    Examples:
      |                                             link |                                     link1     |
      | https://ship.lionnix.net/packages?limit=25&page=1|  https://ship.lionnix.net/bill?limit=25&page=1|


    @prod
    Examples:
      |                                                 link   |                                             link1 |
      | https://ship.lionbay.express/packages?limit=25&page=1  |  https://ship.lionbay.express/bill?limit=25&page=1|