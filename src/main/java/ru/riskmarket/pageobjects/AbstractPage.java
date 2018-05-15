package ru.riskmarket.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

public abstract class AbstractPage
{

    private static final Logger LOG = LogManager.getLogger(AbstractPage.class);

    public SelenideElement get(String cucumberElementName)
    {
        Class<?> clazz = this.getClass();
        for (Field field : clazz.getDeclaredFields())
        {
            if (field.isAnnotationPresent(NameOfElement.class))
            {
                NameOfElement nameOfElementAnnotation = field.getAnnotation(NameOfElement.class);
                if (nameOfElementAnnotation.value().equals(cucumberElementName))
                {
                    try
                    {
                        return (SelenideElement) field.get(this);

                    } catch (IllegalAccessException e)
                    {
                        LOG.info("ERROR: element with name " + cucumberElementName + " at page " + this.getClass().getName() + " is not public");
                    }
                }
            }
        }
        Selenide.screenshot("No_element");
        throw new IllegalArgumentException("ERROR: there is no such element with name " + cucumberElementName + " at page " + this.getClass().getName());
    }

    public ElementsCollection getCollection(String cucumberElementName)
    {
        Class<?> clazz = this.getClass();
        for (Field field : clazz.getDeclaredFields())
        {
            if (field.isAnnotationPresent(NameOfElement.class))
            {
                NameOfElement nameOfElementAnnotation = field.getAnnotation(NameOfElement.class);
                if (nameOfElementAnnotation.value().equals(cucumberElementName))
                {
                    try
                    {
                        return (ElementsCollection) field.get(this);

                    } catch (IllegalAccessException e)
                    {
                        LOG.info("ERROR: element with name " + cucumberElementName + " at page " + this.getClass().getName() + " is not public");
                    }
                }
            }
        }
        Selenide.screenshot("No_elements");
        throw new IllegalArgumentException("ERROR: there is no such element with name " + cucumberElementName + " at page " + this.getClass().getName());
    }


}
