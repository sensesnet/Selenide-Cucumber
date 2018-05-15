@smoketest
Feature: smoke test #1, go through the service to button "Купить"

  Scenario: go through the service to button "Купить"
    Given open riskmarket.ru
    And check that element with name "Войти" is displayed
    And press button with text "Войти" on "первая страница"
    And type to input with name "Логин" text: "off-on-go@mail.ru" on "первая страница"
    And type to input with name "Пароль" text: "Yvm9dHa3xjm6" on "первая страница"
    And press button with text "Вход в кабинет" on "первая страница"
    And wait until login frame disappears
    And select countries: Шенген, Финляндия, Китай
    And specify dates of journey, any available dates
    And specify birthday of tourists: 08.12.1945
    When press button with text "Рассчитать" on "первая страница"
    And spinner should be displayed
    And wait until spinner disappears
    Then collection of "Результаты поиска" should not be empty

  Scenario: go through service to yandex pay-page
    Given press button with text "КУПИТЬ" on "вторая страница"
    And type to input with name "lastName1" text: "TEST1" on "третья страница"
    And type to input with name "firstName1" text: "TEST1" on "третья страница"
    And type to input with name "lastName2" text: "TEST2" on "третья страница"
    And type to input with name "firstName2" text: "TEST2" on "третья страница"
    And type to input with name "telephone" text: "4751231221" on "третья страница"
    And press element with value "agree" and it should be enabled
    And press button with text "Принимаю" on "третья страница"
    And press element with value "Оформить" and it should be enabled
    When press button with text "Оплатить" and it should be enabled
    Then verify that page with url "https://form.payonlinesystem.com/default/draft/form#card" is opened

