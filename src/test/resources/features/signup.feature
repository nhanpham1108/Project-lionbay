Feature: Signup


 Scenario Outline: Đăng ký không thành công do email đã có trên hệ thống
    Given Go to page <link>
    When Ten tai khoan = "m sau tram"
    And Quy mo = "Dưới 150 đơn hàng / tháng"
    And Sdt = "5577777"
    And Set email = <username>
    And Set password = <password>
    And Click button signup
    Then kiemtraemail = "Email đã được sử dụng, vui lòng chọn email khác"
  @dev
    Examples:
      | link   |                                         username   |             password |
      | https://ship.lionnix.net/sign-up|      demob100@yopmail.com |               123455 |


  @prod
    Examples:
      | link   |                                                 username   |  password |
      | https://ship.lionbay.express/sign-up  |      laclac110897@gmail.com |    123455 |

  Scenario Outline: Nhập email không hợp lệ
    Given Go to page <link>
    When Set email = <username>
    Then alert email = "Email không hợp lệ"
  @dev
    Examples:
      | link   |                             username |
      | https://ship.lionnix.net/sign-up|      h12231 |


  @prod
    Examples:
      | link   |                                 username   |
      | https://ship.lionbay.express/sign-up  |      h12231 |

  Scenario Outline: Đăng ký không thành công do nhập họ tên không hợp lệ
    Given Go to page <link>
    When Ten tai khoan = "nhan 123"
    And Quy mo = "Dưới 150 đơn hàng / tháng"
    And Sdt auto
    And Email auto
    And Set password = 123455
    And Click button signup
    Then alert hoten = "Tên tài khoản không hợp lệ"
  @dev
    Examples:
      | link   |
      | https://ship.lionnix.net/sign-up|


  @prod
    Examples:
      | link   |
      | https://ship.lionbay.express/sign-up  |


  Scenario Outline: Đăng ký thành công
    Given Go to page <link>
    When Ten tai khoan = "m sau tram"
    And Quy mo = "Dưới 150 đơn hàng / tháng"
    And Sdt auto
    And Email auto
    And Set password = "123455"
    And Click button signup
    Then kiemtra = "Yêu cầu của bạn đã được gửi"
  @dev
    Examples:
      | link   |
      | https://ship.lionnix.net/sign-up|


  @prod
    Examples:
      | link   |
      | https://ship.lionbay.express/sign-up  |
