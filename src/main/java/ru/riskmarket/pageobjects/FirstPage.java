package ru.riskmarket.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class FirstPage extends AbstractPage
{

    @NameOfElement("Вход в кабинет")
    @FindBy(xpath = "//button[@class='btn progress-button buy-button']//ng-transclude[text()='Войти']")
    public SelenideElement enterToCabinet;

    @NameOfElement("Логин")
    @FindBy(css = "input[name='userName']")
    public SelenideElement login;

    @NameOfElement("Пароль")
    @FindBy(css = "input[name='password']")
    public SelenideElement password;

    @NameOfElement("Войти")
    @FindBy(xpath = "//button[text()='Войти']")
    public SelenideElement enter;

    @NameOfElement("Фрейм входа в кабинет")
    @FindBy(css = ".modal-content")
    public SelenideElement frameEnterToCabinet;

    @NameOfElement("Укажите страну")
    @FindBy(xpath = "//countries-widget//div[@class='countries-widget__wrapper']//input")
    public SelenideElement countryInput;

    @NameOfElement("Даты поездки")
    @FindBy(css = "#preview")
    public SelenideElement datesJourney;

    @NameOfElement("Выпадающий календарь")
    @FindBy(xpath = "//div[@class='period-control__popup']")
    public SelenideElement popupCalendar;

    @NameOfElement("Туристы")
    @FindBy(xpath = ".//*[.='Туристы']")
    public SelenideElement whoIsTravel;

    @NameOfElement("дд.мм.гггг")
    @FindBy(xpath = ".//input[@placeholder='дд.мм.гггг']")
    public SelenideElement travelerBirthDate;

    @NameOfElement("Рассчитать")
    @FindBy(xpath = "//button[.='Рассчитать']")
    public SelenideElement polisCount;

    public void clickAnyAvailableDate()
    {
        popupCalendar.$(xpath("//button[@class ='period-control__popup-month-button period-control__popup-month-button--next']")).click();
        popupCalendar.$("span[data-ng-click]").click();
        popupCalendar.$("span[data-ng-click]").click();
    }
}
