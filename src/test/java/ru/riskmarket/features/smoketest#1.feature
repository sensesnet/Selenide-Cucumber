@smoketest
Feature: smoke test #1, go through the service to button "Купить"

  Scenario: go through the service to button "Купить"

    #actions at first page
    Given open riskmarket.ru
    And check that element with name "Вход в кабинет" is displayed
    And press button with text "Вход в кабинет" on "первая страница"
    And type to input with name "Логин" text: "riskmarket.testoviy2016@yandex.ru" on "первая страница"
    And type to input with name "Пароль" text: "l0dcfJMB" on "первая страница"
    And press button with text "Войти" on "первая страница"
    And wait until login frame disappears
    And select countries: Шенген, Финляндия, Китай
    And specify dates of journey, any available dates
    And specify birthday of tourists: 08.12.1945
    When press button with text "Рассчитать полис" on "первая страница"
    #actions at second page
    And spinner should be displayed
    And wait until spinner disappears
    Then collection of "Результаты поиска" should not be empty

  Scenario: go through service to yandex pay-page

    Given press button with text "КУПИТЬ" on "вторая страница"
    #actions at third page
    And type to input with name "lastName" text: "TESTOVIY" on "третья страница"
    And type to input with name "firstName" text: "TEST" on "третья страница"
    And press button with text "Принимаю" on "третья страница"
    And press element with value "Оформить" and it should be enabled
    When press button with text "Оплатить" and it should be enabled
    Then verify that page with url "https://money.yandex.ru/cashdesk" is opened

