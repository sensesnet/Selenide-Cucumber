package ru.riskmarket.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends AbstractPage {

    @NameOfElement("lastName1")
    @FindBy(xpath = "//h2[text()='Застрахованные']/../..//input[@name='lastName']")
    SelenideElement lastName1;

    @NameOfElement("firstName1")
    @FindBy(xpath = "//h2[text()='Застрахованные']/../..//input[@name='firstName']")
    SelenideElement firstName1;

    @NameOfElement("lastName2")
    @FindBy(xpath = "//h2[text()='Страхователь']/../..//input[@name='lastName']")
    SelenideElement lastName2;

    @NameOfElement("firstName2")
    @FindBy(xpath = "//h2[text()='Страхователь']/../..//input[@name='firstName']")
    SelenideElement firstName2;

    @NameOfElement("telephone")
    @FindBy(xpath = "//h2[text()='Страхователь']/../..//input[@type='tel']")
    SelenideElement telephone;

    @NameOfElement("agree")
    @FindBy(xpath = "//label[@for='user-agreement']")
    SelenideElement agree;

    @NameOfElement("Принимаю")
    @FindBy(xpath = ".//*[contains(text(),'Принимаю')]")
    SelenideElement accept;

    @NameOfElement("Оформить")
    @FindBy(xpath = ".//*[text()='Оформить']")
    SelenideElement content;

    @NameOfElement("Оплатить")
    @FindBy(xpath = ".//button[.='Оплатить']")
    SelenideElement pay;
}
