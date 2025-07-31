package org.example.main;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

public class MainLab {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        System.out.println(classOne.greet());
        ClassTwo classTwo = new ClassTwo();
        System.out.println(classTwo.greet());
        ClassThree classThree = new ClassThree();
        System.out.println(classThree.greet());
    }
}