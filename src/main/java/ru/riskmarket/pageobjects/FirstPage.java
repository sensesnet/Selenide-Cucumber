package ru.riskmarket.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class FirstPage extends AbstractPage
{

    @NameOfElement("Вход в кабинет")
    @FindBy(xpath = "//button[.='Вход в кабинет']")
    public SelenideElement enterToCabinet;

    @NameOfElement("Логин")
    @FindBy(css = "input[name='userName']")
    public SelenideElement login;

    @NameOfElement("Пароль")
    @FindBy(css = "input[name='password']")
    public SelenideElement password;

    @NameOfElement("Войти")
    @FindBy(css = "input[value='Войти']")
    public SelenideElement enter;

    @NameOfElement("Фрейм входа в кабинет")
    @FindBy(css = ".modal-content")
    public SelenideElement frameEnterToCabinet;

    @NameOfElement("Укажите страну")
    @FindBy(css = "#countryInput")
    public SelenideElement countryInput;

    @NameOfElement("Даты поездки")
    @FindBy(css = "#preview")
    public SelenideElement datesJourney;

    @NameOfElement("Выпадающий календарь")
    @FindBy(css = ".period-control-popup")
    public SelenideElement popupCalendar;

    @NameOfElement("Кто едет")
    @FindBy(xpath = ".//*[.='Кто едет']")
    public SelenideElement whoIsTravel;

    @NameOfElement("дд.мм.гггг")
    @FindBy(xpath = ".//input[@placeholder='дд.мм.гггг']")
    public SelenideElement travelerBirthDate;

    @NameOfElement("Рассчитать полис")
    @FindBy(xpath = "//button[.='Рассчитать полис']")
    public SelenideElement polisCount;

    public void clickAnyAvailableDate()
    {
        popupCalendar.$(xpath("(./div[1]/button)[2]")).click();
        popupCalendar.$("span[data-ng-click]").click();
        popupCalendar.$("span[data-ng-click]").click();
    }
}
