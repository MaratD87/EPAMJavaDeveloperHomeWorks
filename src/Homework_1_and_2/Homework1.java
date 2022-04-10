package Homework_1_and_2;
/*
Создать три класса и реализовать наследование
 */
public class Homework1 {

    public static class Animal {
        String name;
        int speed;

        public Animal(){}

        public Animal(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public void move() {
            System.out.println("I can move");
        }
    }

    public class Cat extends Animal {
        int species;

        public Cat(){}

        public Cat(String name, int speed, int weight, int species) {
            super(name, speed);
            this.species = species;
        }

        @Override
        public void move() {
            System.out.println("I can run");
        }
    }

    public class Lion extends Cat {
        String sex;

        public Lion(){}

        public Lion(String name, int speed, int weight, int species, String sex) {
            super(name, speed, weight, species);
            this.sex = sex;
        }

        @Override
        public void move() {
            System.out.println("I can run with 60 km per hour");
        }
    }
}
