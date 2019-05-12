//        Створити клас Кермо, Колесо, Кузов- описати дані класи (гетери, сетери, toString()).
//        Всі поля повинні бути приватними.
//        Додати методи які б виконували певні функції з полями.
//        Створити клас Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов, Колесо-як поля класу.
//        Додати методи для виконання певних функцій. Всі поля повинні бути параметрами в конструкторі.
//        В мейн методі , створити клас Машина, запустити всі його методи.

package com.dumpkin.avivi;

public class Main {

    public static void main(String[] args) {

        //Задаємо параметри для об'єтка


        int radiusSmallCar=13;
        int radiusBigCar=20;
        String Brand="Bogdan";
        String engine="Diesel";

        //  створюємо екземпляри класів для частин автомобіля(агрегація)
        Wheel michelin=new Wheel("Winter",radiusSmallCar);
        Helm shturval=new Helm(Direction.LEFT);
        Body kuzov=new Body("Kabriolet","red");

        //створюємо об'єкт автомобіль і передаємо частини в якості аргументів
       Automobile Shushpanzer = new Automobile(engine,Brand,michelin,shturval,kuzov);

        //викликаємо метод toString() класу  автомобіль
        System.out.println(Shushpanzer.toString());
    }
}
