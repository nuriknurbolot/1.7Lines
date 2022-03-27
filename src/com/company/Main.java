package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// задание 1
        String firsName = "Ivan ";
        String middleName ="Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName  + firsName  + middleName;
        System.out.println("ФИО сотрудника - "+fullName);
        // задание 2
         String upperFullName = fullName.toUpperCase(Locale.ROOT);
        System.out.println(upperFullName);
        // задание 3
        String fulName = "Иванов Семён Семёнович";
                fulName = fulName.replace("ё", "е");
        System.out.println(fulName);

    }
}
