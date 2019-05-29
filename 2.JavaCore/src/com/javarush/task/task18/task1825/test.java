package com.javarush.task.task18.task1825;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class test {

    public List<WebElement> getSomeElements(String path) {
        if (path == null) {
            throw new IllegalArgumentException("getElements: illegal path (NULL)"); //добавление слова new
            // path = "//*[@id='Hello']"; // сюда не зайдет
        }
        WebDriverHelper wd = new WebDriverHelper();
        List<WebElement> result = new ArrayList<>(); //Изменил String на WebElement
        if (wd.isElementsPresent(path)) {
            System.out.println("There aren't any elements by this path");
            return null; //добавление null
        }
        result.addAll(wd.getElements(path)); //add-добавляет только один элемент,а имя метода getElements явно указывает что метод возвращает коллекцию.

        if (!result.isEmpty()) { //инверсия
            Iterator<WebElement> iterator = result.iterator();
            while (iterator.hasNext()) { //нельзя удалить элементы из списка и продолжать итерироваться по нему. Правильно использовать Iterator
                WebElement element = iterator.next();
                if (element.getText().equals("remove")) // убрали ; для объектов нельзя использовать ==
                    result.remove(element);
            }
        } else {
            return null; //  возвращать можно только список,а не элемент списка, возвращаться null,т.к список пуст
        }


        return result;
    }
}



