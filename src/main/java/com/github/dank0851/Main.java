package com.github.dank0851;

public class Main {

    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();

        pb.add("Лапкина", "777-77-77");
        pb.add("Зубенко", "8-800");
        pb.add("Кошкин", "666-66-66");
        pb.add("Зубенко", "555");
        pb.add("Кошкин", "999-99-99");
        pb.add("Крабов", "333-33-33");
        pb.add("Зубенко", "35-35");

        System.out.println("Лапкина: " + pb.get("Лапкина"));
        System.out.println("Зубенко: " + pb.get("Зубенко"));
        System.out.println("Кошкин: " + pb.get("Кошкин"));
        System.out.println("Крабов: " + pb.get("Крабов"));
        System.out.println("Махровый: " + pb.get("Махровый"));

    }
}