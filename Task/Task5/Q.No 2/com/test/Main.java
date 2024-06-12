package com.test;

import com.animals.Animal;
import com.animals.Dog;
import com.animals.Cat;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}

