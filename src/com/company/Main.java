package com.company;

import java.util.*;

class Parent{                       // 2 наследуемых класса
    void method(){
        System.out.println("parent");
    }
}

class User extends Parent{
    void  method(){
        System.out.println("son");
    }
}

class Child extends User{
    void  method(){
        System.out.println("child");
    }
}

public class Main {

    public static void main(String[] args) {
	    List<Parent> list = new ArrayList<>(); //создаем список типа Parent
	    list.add(new Parent()); // добавляем
        list.add(new Child());
	    Main main = new Main(); //создаем Main
	    main.method(list);      // и вызываем метод указанный ниже и передаем туда список
    }

    private void method(List<? super User> list) { // это и есть тот самый метод, он задает правило для метода, на то что ниже нашего метода, нельзя
        list.add(new User());
        for (Object o:list){ // цикл с выводом списка
            Parent p = (Parent)o;
            p.method();
        }
    }
}

// где можно применить, он необходим только в тех случаях, когда не заешь входного данного наверника
class generi <T, U>{
    Object t;
    T generimethod(T t, U u){
        return t;
    }
}
