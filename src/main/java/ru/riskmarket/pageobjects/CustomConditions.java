package ru.riskmarket.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;

public class CustomConditions
{

    public static Condition spinnerShouldBeVisible()
    {
        return new Condition("spinnerShouldBeVisible")
        {
            @Override
            public boolean apply(WebElement element)
            {
                return element.isDisplayed();
            }

            @Override
            public String toString()
            {
                return name + " " + "spinnerShoudBeVisible";
            }
        };
    }
}
