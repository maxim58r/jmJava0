package ru.max.lsn2_10_2;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Max", 37);
        human.sayHello();
    }

    public static class Human {
       private final String name;
       private final int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void sayHello() {
            System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет.");
        }
    }
}
