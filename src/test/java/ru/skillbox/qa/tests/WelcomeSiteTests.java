package ru.skillbox.qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WelcomeSiteTests {

    /*
    Напишите на Java с помощью Selenide тест, автоматизирующий следующий сценарий:
    1. переходит на сайт приветствия https://lm.skillbox.ru/qa_tester/module01/
    2. вводит в поле с именем слово "Вася"
    3. кликает по кнопке
    4. сравнивает полученный текст с фактическим (есть проверка на то, что
    фактический текст равен "Привет, Вася!")
    */

    @Test
    void checkWelcomeText() {
        String name = "Вася";

        open("https://lm.skillbox.cc/qa_tester/module01/");
        $(byName("name")).setValue(name);
        $(".button").click();
        $(".start-screen__res").shouldHave(exactText("Привет, " + name + "!"));
    }

}
