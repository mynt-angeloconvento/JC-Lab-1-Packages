package org.example.main;

import static java.lang.System.*;
import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

public class MainLab {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        out.println(classOne.greet());
        ClassTwo classTwo = new ClassTwo();
        out.println(classTwo.greet());
        ClassThree classThree = new ClassThree();
        out.println(classThree.greet());
    }
}