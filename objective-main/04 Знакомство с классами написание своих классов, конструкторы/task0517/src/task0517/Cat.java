package task0517;

/* 
Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.


Requirements:
1. У класса Cat должна быть переменная name с типом String.
2. У класса Cat должна быть переменная age с типом int.
3. У класса Cat должна быть переменная weight с типом int.
4. У класса Cat должна быть переменная address с типом String.
5. У класса Cat должна быть переменная color с типом String.
6. У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
7. У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
8. У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
9. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
10. У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.*/

public class Cat {
    //напишите тут ваш код

    public static void main(String[] args) {

    }
}
