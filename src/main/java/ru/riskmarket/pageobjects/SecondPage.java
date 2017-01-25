package ru.riskmarket.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends AbstractPage
{

    @NameOfElement("Spinner")
    @FindBy(css = ".spinner-container")
    SelenideElement spinner;

    @NameOfElement("Результаты поиска")
    @FindAll(@FindBy(xpath = ".//search-result-item"))
    ElementsCollection searchResult;

    @NameOfElement("КУПИТЬ")
    @FindBy(xpath = ".//button[.='КУПИТЬ']")
    SelenideElement btnBuy;


}
