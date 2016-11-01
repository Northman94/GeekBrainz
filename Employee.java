/**
 * Created by Zhanat on 21.10.16.
 */


//    ДЗ на урок № 4

//   Задание №1 - №3  - ощибок не выбивает, но результата не выдает. Не нашел как устранить.

public class Employee {
    public static void main(String[] args) {

        class Employer {
            String name;
            String position;
            String email;
            String phone;
            int salary;
            int age;


            Employer() {
                Employer p1 = new Employer();

                p1.name = "Sam";
                p1.position = "Main Designer";
                p1.email = " Sam555@gmail.com";
                p1.phone = "+38(077)748 33 30";
                p1.salary = 20000;
                p1.age = 25;

                System.out.print("Employee INFO: " + p1.name + p1.position + p1.email + p1.phone + p1.salary + p1.age);
            }
        }
        System.out.println();
    }
}


//  Задание № 4 -  тут что-то IDEA не нравится с ; и () или {}

public class Array {
    String name, position, email, phone, salary;
    int age;


    public Array(String name, String position, String email, String phone, String salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

        Array[] person = new Array;

// тут не понятно, почему-то меньше подчеркивает если (), а не {}
        person[0] = ("Peter Hodro", "Designer", "ivivan@mailbox.com", "0843884472", "30000", 30);
        person[1] = ("Sebastian Gooder", "Programmer", "irli@@mailbox.com", "0447395746", "5000", 25);
        person[2] = ("Boan Ferald", "Guard", "totty@mailbox.com", "088333882", "4000", 42);
        person[3] = ("Rita Merkeln", "Plumber", "pampam@mailbox.com", "0455557778", "5000", 54);
        person[4] = ("Rubert Schwats", "Photographer", "pow@mailbox.com", "0874773888", "3700", 26);


        for (int i = 0; i < person.length; i++) {
            if (age > 40)
                System.out.println("Этим сотрудникам больше 40 лет [" + i + "] : " + person[i]);
        }
    }
}
