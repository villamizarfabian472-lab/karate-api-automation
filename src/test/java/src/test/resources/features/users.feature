Feature: prueba api usuarios

Scenario: consultar usuario

  Given url 'https://reqres.in/api/users/2'
  When method get
  Then status 200
