package com.github.dank0851;

/*
* 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий
* и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять
*  записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть,
* что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
* тогда при запросе такой фамилии должны выводиться все телефоны.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final Map<String, List<String>> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    public void add(String family, String number) {
        if (!book.containsKey(family)) {
            book.put(family, new ArrayList<>());
        }
        book.get(family).add(number);
    }

    public List<String> get(String family) {
        if (book.containsKey(family)) {
            return book.get(family);
        }
        return null;
    }
}

