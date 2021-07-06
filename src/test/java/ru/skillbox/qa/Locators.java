package ru.skillbox.qa;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Locators {

    void locator() {
        //http://qa.skillbox.ru/module09/practice4/Kontakty/index.html

        // 1. Локатор кнопки "Отправить"
        $("[value='Отправить']");

        // 2. Локатор поля с текстом "Опишите свои впечатления в нескольких предложениях"
        $(byName("comments"));

        //3. Локатор поля для ввода имени. Локатор должен искать по атрибуту placeholder. Используйте CSS.
        $("[placeholder='Имя']");

        //4. Локатор поля для ввода E-mail. Локатор должен искать по атрибуту name, используйте XPath.
        $x("//input[@name='email']");

        //5. Локатор кнопки в меню "Интересные статьи". Внимание: этот локатор-исключением, по нему у вас будет искать 2 элемента, и это нормально.
        $x("//div[@class='menu']//a[.='Интересные статьи']"); //если нужно, чтобы один нашелся элемент
        $(byText("Интересные статьи"));
        $x("//a[text()='Интересные статьи']");


        //На странице: http://qa.skillbox.ru/module09/practice4/Catalog/index.html

        //6. Локатор элемента <div class="catalog"> с указанием ближайшего родительского элемента в локаторе. Используйте CSS или XPath.
        $(".catalog").parent();
        $x("//div[@class='catalog']/..");

        //7. Локатор !второго! элемента <div class="product-block">. Используйте CSS или XPath. Этот локатор не обязательный для решения, это бонусное задание.
        $(".product-block", 1);
        $x("(//div[@class='product-block'])[2]");

        //8. Локатор элемента <header class="header">. Постройте локатор следующим образом: элемент с тегом header, атрибут class которого содержит слово "hea". Используйте CSS или XPath. Этот локатор не обязательный для решения, это бонусное задание.
        $x("//header[contains(@class, 'hea')]");


    }
}
